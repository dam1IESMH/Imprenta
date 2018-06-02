/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imprenta.UI;

import imprenta.*;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sergio
 */
public class Datos {

    static ArrayList<Cliente> clientes = new ArrayList<>();
    static ArrayList<Operario> operarios = new ArrayList<>();
    static ArrayList<Trabajo> trabajos = new ArrayList<>();
    static ArrayList<Modificacion> modificaciones = new ArrayList<>();
    static ArrayList<Maquina> maquinas = new ArrayList<>();
    static Operario opActual;
    static Cliente cliActual;

    static File storedOperarios = new File("operarios.dat"),
            storedClientes = new File("clientes.dat"),
            storedTrabajos = new File("trabajos.dat"),
            storedMaquinas = new File("maquinas.dat");

    static void cargarOperarios() {
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream(storedOperarios));
            operarios.clear();
            while (true) {
                operarios.add((Operario) ois.readObject());
            }
        } catch (EOFException eof) {
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    static void cargarClientes() {
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream(storedClientes));
            clientes.clear();
            while (true) {
                clientes.add((Cliente) ois.readObject());
            }
        } catch (EOFException eof) {
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    static void cargarTrabajos() {
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream(storedTrabajos));
            trabajos.clear();
            while (true) {
                trabajos.add((Trabajo) ois.readObject());
            }
        } catch (EOFException eof) {
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    static void cargarMaquinas() {
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream(storedMaquinas));
            maquinas.clear();
            while (true) {
                maquinas.add((Maquina) ois.readObject());
            }
        } catch (EOFException eof) {
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    static void guardarOperarios() {
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream(storedOperarios));
            for (Operario o : operarios) {
                oos.writeObject(o);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (oos != null) {
                    oos.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    static void guardarClientes() {
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream(storedClientes));
            for (Cliente c : clientes) {
                oos.writeObject(c);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (oos != null) {
                    oos.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    static void guardarTrabajos() {
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream(storedTrabajos));
            for (Trabajo t : trabajos) {
                oos.writeObject(t);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (oos != null) {
                    oos.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    static void guardarMaquinas() {
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream(storedMaquinas));
            for (Maquina m: maquinas) {
                oos.writeObject(m);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (oos != null) {
                    oos.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
