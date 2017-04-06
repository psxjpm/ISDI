public class MainActivity extends AppCompatActivity {
    //TODO declara variables globales para el texto, el botón y el relative layout

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        //TODO instancia los elementos de UI (pista: variables globales)
       
        //TODO agrega un onClickListener para el botón y agrega un intent dentro de onClick
        
        //El intent deberá llamar el método startActivityForResult()
        
       

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==2)
        {

            String message=data.getStringExtra("MESSAGE");
            txt.setText(message);
            String color = data.getStringExtra("COLOR");
            changeBackground(color);
        }
    }
    public void changeBackground(String color) {
        if (color.equals("red")) {
            rel.setBackgroundColor(Color.RED);
        } else if (color.equals("green")) {
            rel.setBackgroundColor(Color.GREEN);
        } else if (color.equals("blue")) {
            rel.setBackgroundColor(Color.BLUE);
        } else if (color.equals("yellow")) {
            rel.setBackgroundColor(Color.YELLOW);
        } else if (color.equals("magenta")) {
            rel.setBackgroundColor(Color.MAGENTA);
        }
    }

}
