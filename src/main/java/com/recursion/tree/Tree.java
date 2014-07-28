package com.recursion.tree;

public class Tree {
    private Node root;
    
    
    public Node find(int key){
        
        Node current = root;
        while(current.getPerson().getiData()!=key){
            if(current.getPerson().getiData()>key){
                current=current.getLeftChild();
            }else{
                current=current.getRigthChild();
            }
            if(current==null){
                return null;
            }
        }
        return current;
    }
    
    public void insert(int id ,double iData){
        
        Node node = new Node();
        node.setPerson(new Person(id, iData));
        if(root == null){
            root = node;
        }else{
            Node  temp = root;
            boolean flag =true;
            while(flag){
                if(temp.getPerson().getiData()>id){
                   if(temp.getLeftChild()!=null){
                       temp=temp.getLeftChild();
                   }else{
                       temp.setLeftChild(node);
                   }
                }else{
                    if(temp.getRigthChild()!=null){
                        temp=temp.getRigthChild();
                        flag=false;
                    }else{
                        temp.setRigthChild(node);
                        flag=false;
                    }
                }
            }
        }
    }
    public boolean delete(int key){
        Node  current = root;
        Node parent = root;
        
        boolean isLeftchild=true;
        while(current.getPerson().getiData()!=key){
            if(key<current.getPerson().getiData()){
                isLeftchild=true;
                current=current.getLeftChild();
            }else{
                isLeftchild=false;
                
                current=current.getRigthChild();
                
            }
            if(current==null){
                return false;
            }
            parent=current;
        }
        
        
        if(current.getLeftChild()==null && current.getRigthChild()==null){
            if(current.equals(root)){
                root =null;
            }else if(isLeftchild){
               parent.setLeftChild(null); 
            }else{
                parent.setRigthChild(null); 
            }
        }else if(current.getLeftChild()!=null && current.getRigthChild()==null){
            parent.setLeftChild(current.getLeftChild());
            
        }else if(current.getLeftChild()==null && current.getRigthChild()!=null){
            parent.setRigthChild(current.getRigthChild());
        }else{
            Node successor = getSuccessor(current);
            if(current==root){
                root = successor;
            }else if(isLeftchild){
                parent.setLeftChild(successor);
            }else{
                parent.setRigthChild(successor);
            }
            successor.setLeftChild(current.getLeftChild());
        }
        return true;
        
        
        
        
    }
    
    
    private Node getSuccessor(Node delNode){
        Node successorParent = delNode;
        Node successor = delNode;
        Node current = delNode.getRigthChild();
        
        while(current!=null){
            successorParent =  successor;
            successor = current;
            current= current.getLeftChild();
        }
        
        if(successor.equals(delNode.getRigthChild())){
            successorParent.setLeftChild(successor.getRigthChild());
            successor.setRigthChild(delNode.getRigthChild());
        }
        return successor;
        
    }
    
    

}
