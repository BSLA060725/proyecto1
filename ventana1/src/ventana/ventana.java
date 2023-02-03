package ventana;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.util.Arrays;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;


public class ventana extends JFrame {
    //creamos constructor de ventada
    public JPanel panel;
    public ventana(){
        this.setSize(500, 500);
       this.setDefaultCloseOperation(EXIT_ON_CLOSE);//para cerrar la venta al cerrar la ventana 
        this.setTitle("BENJAMIN");//establecemos el titulo de la ventana 
        //setLocation(250, 100);//Establecemos posicon inical de la ventana 
        //setBounds(300, 159, 250, 250);//englovamineto de size y location
        this.setLocationRelativeTo(null);//establecemos la ventana en el centro de la pantalla
        //setResizable(false);//para que la ventana se quede con una medida espesifica 
        
        setMinimumSize(new Dimension(200,200));//pude redimencionarse pero el tamaño minimo es de 200x200px
       // getContentPane().setBackground(Color.black);//cambiar el color al fondo
      iniciar_componentes();
     
    }
    private void colocarBottones(){
        //botoon 1 -boton de texto
        JButton boton1=new JButton("entra");//creamos un boton
        //boton1.setText("entraa");//Establecemos un texto en el boton 2da forma
        boton1.setBounds(30, 30, 70, 30);//dimencionamos el boton
        boton1.setEnabled(true);//true para tener interaccion con el boton ,false para desactivarlo
        boton1.setMnemonic('a');//pata tener intecion con el boton con la letra "letra"+ALT
        boton1.setForeground(Color.red);//cambiamos el color a la letra
        boton1.setFont(new Font("arial",Font.BOLD , 10));//cambiar la fuente de la letra del boton
        
        //boton 2 _boton de imagen
        JButton boton2=new JButton();
        boton2.setBounds(120, 30, 70, 30);//dimencionamos el boton
        boton2.setBackground(Color.red);//establecemos el color de fondo del bottoven
        ImageIcon clikaqui=new ImageIcon("clik.jpg");//llamammos la img
        boton2.setIcon(new ImageIcon(clikaqui.getImage().getScaledInstance(boton2.getWidth(), boton2.getHeight(), Image.SCALE_SMOOTH)));//redimencionar la imagen
        //boton 3 _boton para cambiar los bordes
        JButton boton3= new JButton();
        boton3.setBounds(240, 30, 70, 30);
        //boton3.setBorder(BorderFactory.createLineBorder(Color.yellow));//COLOCAMOS EL COLOR DEL BORDE DEL BOTON
        //boton3.setBorder(BorderFactory.createLineBorder(Color.yellow, 4));//espesificar el color y los pixeles de ancho del borde
        boton3.setBorder(BorderFactory.createLineBorder(Color.yellow, 4, true));////espesificar el color y los pixeles de ancho del borde y cambiar las ezquinas del borde con valores vuleanos
        
        panel.add(boton3);
        panel.add(boton2);
        panel.add(boton1);//agrgamos el boton al panel
    }
    private void iniciar_componentes(){
        Panel();
        //etiquetas();
        //colocarBottones();
        //RadioBotones();
        //BotonesDeActivacion();
        //ColocarCajarDeTexto();
        //Areadetexto();
        //colocarCasillasDeVerificacion();
        //colocarListasDesplegables();
        //colocarcampodecontraseñas();
        //Tablas();
        ColocarListas();
    }
    // creamos una clase para el panel
    private void Panel(){
        //creacion de un panel 
         panel =new JPanel();
       panel.setBackground(Color.gray);//establecmos el color del panel 
        this.getContentPane().add(panel);//agregamos el el panel a la venta 
        panel.setLayout(null);//desactivando el diseño por defecto del panel 
        
    }
    
    private void etiquetas(){
        // creacion de una etiqueta
       JLabel etiqueta=new JLabel();
       //2da forma de centrar elemntos de etiqueta
       etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
      /*con Swin...... colocamos el texto donde nosotros quedramos derecha,izquierda,centro  */
      //1mera forma 
    //  JLabel etiqueta=new JLabel ("Hola benjamin",SwingConstants.CENTER);
        //utilizamos otro modo llamando al nombre del objeto
       etiqueta.setText(" cronica");
        etiqueta.setBounds(45, 20, 400, 100);//pocisionando nuestra etiqueda y dando el 
        //alto y el ancho
         etiqueta.setForeground(Color.white);//establecer color del texto
        etiqueta.setOpaque(true);//establecemos pintar el color de fondo de la etiqueta
        etiqueta.setBackground(Color.black);//Establecemos color de fondo de la etiqueta
        etiqueta.setFont(new Font("impact",Font.BOLD,40 ));//modificar letra de la etiqueta
        panel.add(etiqueta);//Agregamos la etiquta al panel
        
        //agregar etiqeuta de imagenes
        //primera forma de meter una imagen
         /*
                 JLabel etiqueta2 =new JLabel(new ImageIcon("cronix.jpg"));//llamamos a la imagen 
        etiqueta2.setBounds(160, 200, 150, 179);//posicionalmos y comlocamos las dimenciones
        panel.add(etiqueta2);//insertamos la etiqueta en el panel
                */
       
        //segunda foram de meter una imagen 
        
                
        ImageIcon imagen=new ImageIcon("chris-bumstead-750x393.jpg");
        JLabel etiqueta3 =new JLabel(imagen);//colocamos la imagen dentro de etiqueta 3
        etiqueta3.setBounds(100, 150, 250, 250);//posicionalmos y comlocamos las dimenciones
        etiqueta3.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(etiqueta3.getWidth(), etiqueta3.getHeight(), Image.SCALE_SMOOTH)));
        //CONTROLAMOS LA DIMENCION DE LA IMAGEN IGUAL A LA DIMENCION DEL SETBOUNDS 
        panel.add(etiqueta3);
        
        }
 
    private void RadioBotones(){
        //creamos los botones
        //boton 1
        JRadioButton radiobotn = new JRadioButton("opcion1 ",true);//el trusirve para que una vez ejecutado el programa se marque automaticamente
        radiobotn.setBounds(50, 60, 120, 30);
        radiobotn.setEnabled(true);//tambien se puede abilitar o desavilitar con setenable "true" para abilitar y "false" para desabilitar
      //radiobotn.setText("holaaa");//colocar texto de la segunda forma en caso no colques en el constructor
        radiobotn.setFont(new Font("arial", Font.BOLD, 15));//cambiar el tamaño estilo y fuente de la letra del boton
        panel.add(radiobotn);
        
        //boton 2
         JRadioButton radiobotn2 = new JRadioButton("opcion2",false);//y el false es para que no se marque al iniciar el programa automticamente
        radiobotn2.setBounds(120, 120, 120, 30);
        radiobotn2.setEnabled(true);//tambien se puede abilitar o desavilitar con setenable "true" para abilitar y "false" para desabilitar
      //radiobotn2.setText("holaaa");//colocar texto de la segunda forma en caso no colques en el constructor
       radiobotn2.setFont(new Font("arial", Font.BOLD, 15));//cambiar el tamaño estilo y fuente de la letra del boton  
        panel.add(radiobotn2);
        
        //boton 3
        JRadioButton radiobotn3 = new JRadioButton("opcion3",false);
        radiobotn3.setBounds(180, 180, 120, 30);
        radiobotn3.setEnabled(true);//tambien se puede abilitar o desavilitar con setenable "true" para abilitar y "false" para desabilitar
      //radiobotn3.setText("holaaa");//colocar texto de la segunda forma en caso no colques en el constructor
        radiobotn3.setFont(new Font("arial", Font.BOLD, 15));//cambiar el tamaño estilo y fuente de la letra del boton   
        panel.add(radiobotn3);
        
        //grupo de botones
        //sirve para que trabajen en grupo en otras palabras para que uno se desmarque y el otro se marque
        ButtonGroup grupobones=new ButtonGroup();
        grupobones.add(radiobotn);//agregamos el primer boton
        grupobones.add(radiobotn2);//agregamos el segundo boton
        grupobones.add(radiobotn3);//agregamos el tercer boton
    }
    
    private void BotonesDeActivacion(){
        //creamos los tooglebuton
        //tooglebuton 1
        JToggleButton botonenable=new JToggleButton("opcion 1",true);//el true o el false sirve para que si es "true" al ejecutar este precionado y si es "false" al ejecutar no este precionado       botonenable.setBounds(40, 50, 90, 20);
       botonenable.setBounds(50, 50, 90, 20);
        panel.add(botonenable);
        
        //toogelbutton 2
         JToggleButton botonenable2=new JToggleButton("opcion 2",false);
        botonenable2.setBounds(150, 50, 90, 20);
        panel.add(botonenable2);
        
        //toogelbutton 3
         JToggleButton botonenable3=new JToggleButton("opcion 3",false);
        botonenable3.setBounds(250, 50, 90, 20);
        panel.add(botonenable3);
        
        //cremos grupo de botones para que si se marca uno se desmarque los demas 
        ButtonGroup grupobonesactivados=new ButtonGroup();
        grupobonesactivados.add(botonenable);
        grupobonesactivados.add(botonenable2);
        grupobonesactivados.add(botonenable3);
    }
    
    private void ColocarCajarDeTexto(){
        //creamos una caja de texto 
        //caja de texto 1
        //el numero de columnas aparecera siempra i caundo se desactive el diseño en otras palabras el panel.setLayout(null)
                            //Sintaxis(nombre ,numero de culumnas)
        JTextField CajaDeTexto =new JTextField ();
        CajaDeTexto.setBounds(50, 50, 100, 50);//dimecionamos la caja de texto
        CajaDeTexto.setText("ingrese su nombre");//colocamos un nombre de ejempli para mostrarlo
        //optenemos el texto de la caja
        System.out.println("el texto de la caja es "+CajaDeTexto.getText());
        panel.add(CajaDeTexto);//agregamos la caja al panel
    }
    
    private void Areadetexto(){
        //creamos un area de txto 
        JTextArea texto_area=new JTextArea();
        texto_area.setBounds(20, 20, 300, 200);//dimecionamos la caja de texto 
        texto_area.setText("escriba el texto");//colocamos un nombre al area de texto de ejmplo
        //System.out.println("el texto es : "+texto_area.getText());//imprimimos lo que esta escrito
        texto_area.append("escribe x aqui");//agregar mas texto al areadetexto
        texto_area.setEditable(true);//este metodo sirve para editar en contenido en caso "true" se edita en caso "false" no se puede editar 
        panel.add(texto_area);//agregamos al panel 
        
        //barras de desplazamiento para el area de texto
        //creamos un dezplamineto
        JScrollPane dezplamanieto=new JScrollPane(texto_area);
         dezplamanieto.setBounds(20, 20, 300, 200);//dimecionamos a la barra de dezplamiento igual al area de texto
        panel.add(dezplamanieto);//agregamos al panel 
       
    }
    
    private void colocarCasillasDeVerificacion(){
        //creamos un chec vox
        JCheckBox verificacion1=new JCheckBox("ejemplo 1",true);//true o folse para que cuando se ejecute el programa se automarque
        verificacion1.setBounds(20, 20, 100, 40);//dimecionamos a la barra de dezplamiento igual al area de texto
        
        verificacion1.setEnabled(false);//para una vez ejecutado no se puede modificar "true"para dejar con modificacion de activado "false" para que no se pueda modificar
        panel.add(verificacion1);
        
        JCheckBox verificacion2=new JCheckBox("ejemplo 2");
        verificacion2.setBounds(20, 50, 100, 40);//dimecionamos a la barra de dezplamiento igual al area de texto
        panel.add(verificacion2);
        
        JCheckBox verificacion3=new JCheckBox("ejemplo 3");
        verificacion3.setBounds(20, 80, 100, 40);//dimecionamos a la barra de dezplamiento igual al area de texto
        panel.add(verificacion3);
    }  
    
    private void colocarListasDesplegables(){
       /* //creamos el arreglo de listas desplegables 
        String arreglo[]={"PERU","PARAGAIAY","CHILE","AFRICA"};
        //Creamos listas desplegables
        JComboBox listasdesplegable=new JComboBox(arreglo);//pasamos como parametro el arreglo "nombre"
        listasdesplegable.addItem("colombia");//addItem sirve par aagregar elementos al arreglo de la listadesplegable
        listasdesplegable.setBounds(20, 20, 100, 40);//dimecionamos 
        listasdesplegable.setSelectedItem("CHILE");//sirve para que inizializado el programa se selecione automaticamente 
        panel.add(listasdesplegable);  */
       
        //Creamos objetos de la clase persona
        persona persona1=new persona("benjamin", 17, "peruano");
        persona persona2=new persona("juan perez", 21, "colombiano");
        
        //creamos un defaultcomboboxmode un objeto 
        DefaultComboBoxModel modelo=new DefaultComboBoxModel();
        modelo.addElement(persona1);//agregamos el objeto persona 1 a DefaultComboBoxModel
        modelo.addElement(persona2);
       
        //creamos un jcombobox
        JComboBox listadesplegable =new JComboBox(modelo);//le pasamos como parametro "modelos" de DefaultComboBoxModel
        listadesplegable.setBounds(20, 20, 200, 40);//dimecionamos
        panel.add(listadesplegable);
    }
    
    private void colocarcampodecontraseñas(){
        //creamos objeto de tipo contraseña
        JPasswordField contraseña=new JPasswordField();
        contraseña.setBounds(20, 20, 200, 40);//dimecionamos
        contraseña.setText("hola");//establecemos un texto como contraseña
        
        String contra="";//creamos una variable vacia
        for(int i=0;i< contraseña.getPassword().length;i++){//recorremos el arreay.tostring 
            contra+=contraseña.getPassword()[i]; //y los caracteres encontrados los guardamos en contra
        }
          
        System.out.println("obtenemos la contraseña : "+contra);//recolectamos el dato guardado en contra
        panel.add(contraseña);
    }
    
    private void Tablas(){
        //creamos un objeto de tipo DefaultTableModel
        DefaultTableModel modelo =new DefaultTableModel();
        modelo.addColumn("nombre");//cramos columnas verticales
        modelo.addColumn("edad");//cramos columnas verticales
        modelo.addColumn("nacionalidad");//cramos columnas verticales
        
        //cREAMOS EL AREGLO TIPO STRING
        String person[]={"benjamin","17","peruano"};
        String person2[]={"JUAN","31","peruano"};
        
        modelo.addRow(person);//SE LE PASA COMO PARAMETRO UN ARREGLO DE STRING 
        modelo.addRow(person2);//agregamos otra fila
       
        //creamos objeto de una tabla
        JTable tabla=new JTable(modelo);
        tabla.setBounds(20, 20, 200, 300);//dimecionamos
        panel.add(tabla);//agregamos al panel
        
        JScrollPane scrool=new JScrollPane(tabla,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);//para que se agrege el scrol y sea visible nuestra tabla 
        scrool.setBounds(20, 20, 200, 300);//dimecionamos
        panel.add(scrool);//agregamos al panel
    }
    
    private void ColocarListas(){
        //foma uno de agregar elemetos de la clase persona 
        persona persona1=new persona("juan", 13, "peruano");
        
        DefaultListModel modelo =new DefaultListModel();//creqmos el modelo
        //forma 2 de agregar elemetos de la clase persona pasandolo como parametro 
        modelo.addElement(new persona("benjmian", 12, "peruano"));
        modelo.addElement(new persona("benjmian", 12, "peruano"));
        modelo.addElement(new persona("benjmian", 12, "peruano"));
        modelo.addElement(new persona("benjmian", 12, "peruano"));
        modelo.addElement(new persona("benjmian", 12, "peruano"));
        modelo.addElement(new persona("benjmian", 12, "peruano"));
        modelo.addElement(new persona("benjmian", 12, "peruano"));
        modelo.addElement(new persona("benjmian", 12, "peruano"));
        modelo.addElement(new persona("benjmian", 12, "peruano"));
        modelo.addElement(new persona("benjmian", 12, "peruano"));
        modelo.addElement(new persona("benjmian", 12, "peruano"));
        modelo.addElement(new persona("benjmian", 12, "peruano"));
        modelo.addElement(new persona("benjmian", 12, "peruano"));
        modelo.addElement(new persona("benjmian", 12, "peruano"));
        modelo.addElement(new persona("benjmian", 12, "peruano"));
        modelo.addElement(new persona("benjmian", 12, "peruano"));
        
        modelo.addElement(persona1);//agregamos el elemento 2 
        JList lisat=new JList(modelo);//pasamos como parametro el nombre en este caso "modelo"
        lisat.setBounds(20, 20, 200, 300);//dimecionamos
        panel.add(lisat);
        
        //creamos un jscroolpnae
        JScrollPane scrol=new JScrollPane(lisat,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrol.setBounds(20, 20, 200, 300);//dimecionamos
        panel.add(scrol);
    }

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
   