package shop.sport.sklep;

import java.io.IOException;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;


import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import android.util.Log;

public class XMLParser {

    // constructor
    public XMLParser() {

    }

//    /**
//     * Getting XML from URL making HTTP request
//     * @param url string
//     * */
    public String getXmlFromUrl(String url) {
        String xml = "<music>\n" +
                "<song>\n" +
                "<id>1</id>\n" +
                "<title>Someone Like You</title>\n" +
                "<artist>Adele</artist>\n" +
                "<duration>4:47</duration>\n" +
                "<thumb_url>\n" +
                "https://api.androidhive.info/music/images/adele.png\n" +
                "</thumb_url>\n" +
                "</song>\n" +
                "<song>\n" +
                "<id>2</id>\n" +
                "<title>Space Bound</title>\n" +
                "<artist>Eminem</artist>\n" +
                "<duration>4:38</duration>\n" +
                "<thumb_url>\n" +
                "https://api.androidhive.info/music/images/eminem.png\n" +
                "</thumb_url>\n" +
                "</song>\n" +
                "<song>\n" +
                "<id>3</id>\n" +
                "<title>Stranger In Moscow</title>\n" +
                "<artist>Michael Jackson</artist>\n" +
                "<duration>5:44</duration>\n" +
                "<thumb_url>https://api.androidhive.info/music/images/mj.png</thumb_url>\n" +
                "</song>\n" +
                "<song>\n" +
                "<id>4</id>\n" +
                "<title>Love The Way You Lie</title>\n" +
                "<artist>Rihanna</artist>\n" +
                "<duration>4:23</duration>\n" +
                "<thumb_url>\n" +
                "https://api.androidhive.info/music/images/rihanna.png\n" +
                "</thumb_url>\n" +
                "</song>\n" +
                "<song>\n" +
                "<id>5</id>\n" +
                "<title>Khwaja Mere Khwaja</title>\n" +
                "<artist>A R Rehman</artist>\n" +
                "<duration>6:58</duration>\n" +
                "<thumb_url>\n" +
                "https://api.androidhive.info/music/images/arrehman.png\n" +
                "</thumb_url>\n" +
                "</song>\n" +
                "<song>\n" +
                "<id>6</id>\n" +
                "<title>All My Days</title>\n" +
                "<artist>Alexi Murdoch</artist>\n" +
                "<duration>4:47</duration>\n" +
                "<thumb_url>\n" +
                "https://api.androidhive.info/music/images/alexi_murdoch.png\n" +
                "</thumb_url>\n" +
                "</song>\n" +
                "<song>\n" +
                "<id>7</id>\n" +
                "<title>Life For Rent</title>\n" +
                "<artist>Dido</artist>\n" +
                "<duration>3:41</duration>\n" +
                "<thumb_url>https://api.androidhive.info/music/images/dido.png</thumb_url>\n" +
                "</song>\n" +
                "<song>\n" +
                "<id>8</id>\n" +
                "<title>Love To See You Cry</title>\n" +
                "<artist>Enrique Iglesias</artist>\n" +
                "<duration>4:07</duration>\n" +
                "<thumb_url>\n" +
                "https://api.androidhive.info/music/images/enrique.png\n" +
                "</thumb_url>\n" +
                "</song>\n" +
                "<song>\n" +
                "<id>9</id>\n" +
                "<title>The Good, The Bad And The Ugly</title>\n" +
                "<artist>Ennio Morricone</artist>\n" +
                "<duration>2:42</duration>\n" +
                "<thumb_url>\n" +
                "https://api.androidhive.info/music/images/ennio.png\n" +
                "</thumb_url>\n" +
                "</song>\n" +
                "<song>\n" +
                "<id>10</id>\n" +
                "<title>Show me the meaning</title>\n" +
                "<artist>Backstreet Boys</artist>\n" +
                "<duration>3:56</duration>\n" +
                "<thumb_url>\n" +
                "https://api.androidhive.info/music/images/backstreet_boys.png\n" +
                "</thumb_url>\n" +
                "</song>\n" +
                "<song>\n" +
                "<id>11</id>\n" +
                "<title>Someone Like You</title>\n" +
                "<artist>Adele</artist>\n" +
                "<duration>4:47</duration>\n" +
                "<thumb_url>\n" +
                "https://api.androidhive.info/music/images/adele.png\n" +
                "</thumb_url>\n" +
                "</song>\n" +
                "<song>\n" +
                "<id>12</id>\n" +
                "<title>Space Bound</title>\n" +
                "<artist>Eminem</artist>\n" +
                "<duration>4:38</duration>\n" +
                "<thumb_url>\n" +
                "https://api.androidhive.info/music/images/eminem.png\n" +
                "</thumb_url>\n" +
                "</song>\n" +
                "<song>\n" +
                "<id>13</id>\n" +
                "<title>Stranger In Moscow</title>\n" +
                "<artist>Michael Jackson</artist>\n" +
                "<duration>5:44</duration>\n" +
                "<thumb_url>https://api.androidhive.info/music/images/mj.png</thumb_url>\n" +
                "</song>\n" +
                "<song>\n" +
                "<id>14</id>\n" +
                "<title>Love The Way You Lie</title>\n" +
                "<artist>Rihanna</artist>\n" +
                "<duration>4:23</duration>\n" +
                "<thumb_url>\n" +
                "https://api.androidhive.info/music/images/rihanna.png\n" +
                "</thumb_url>\n" +
                "</song>\n" +
                "<song>\n" +
                "<id>15</id>\n" +
                "<title>Khwaja Mere Khwaja</title>\n" +
                "<artist>A R Rehman</artist>\n" +
                "<duration>6:58</duration>\n" +
                "<thumb_url>\n" +
                "https://api.androidhive.info/music/images/arrehman.png\n" +
                "</thumb_url>\n" +
                "</song>\n" +
                "<song>\n" +
                "<id>16</id>\n" +
                "<title>All My Days</title>\n" +
                "<artist>Alexi Murdoch</artist>\n" +
                "<duration>4:47</duration>\n" +
                "<thumb_url>\n" +
                "https://api.androidhive.info/music/images/alexi_murdoch.png\n" +
                "</thumb_url>\n" +
                "</song>\n" +
                "<song>\n" +
                "<id>17</id>\n" +
                "<title>Life For Rent</title>\n" +
                "<artist>Dido</artist>\n" +
                "<duration>3:41</duration>\n" +
                "<thumb_url>https://api.androidhive.info/music/images/dido.png</thumb_url>\n" +
                "</song>\n" +
                "<song>\n" +
                "<id>18</id>\n" +
                "<title>Love To See You Cry</title>\n" +
                "<artist>Enrique Iglesias</artist>\n" +
                "<duration>4:07</duration>\n" +
                "<thumb_url>\n" +
                "https://api.androidhive.info/music/images/enrique.png\n" +
                "</thumb_url>\n" +
                "</song>\n" +
                "<song>\n" +
                "<id>19</id>\n" +
                "<title>The Good, The Bad And The Ugly</title>\n" +
                "<artist>Ennio Morricone</artist>\n" +
                "<duration>2:42</duration>\n" +
                "<thumb_url>\n" +
                "https://api.androidhive.info/music/images/ennio.png\n" +
                "</thumb_url>\n" +
                "</song>\n" +
                "<song>\n" +
                "<id>20</id>\n" +
                "<title>Show me the meaning</title>\n" +
                "<artist>Backstreet Boys</artist>\n" +
                "<duration>3:56</duration>\n" +
                "<thumb_url>\n" +
                "https://api.androidhive.info/music/images/backstreet_boys.png\n" +
                "</thumb_url>\n" +
                "</song>\n" +
                "<song>\n" +
                "<id>21</id>\n" +
                "<title>Someone Like You</title>\n" +
                "<artist>Adele</artist>\n" +
                "<duration>4:47</duration>\n" +
                "<thumb_url>\n" +
                "https://api.androidhive.info/music/images/adele.png\n" +
                "</thumb_url>\n" +
                "</song>\n" +
                "<song>\n" +
                "<id>22</id>\n" +
                "<title>Space Bound</title>\n" +
                "<artist>Eminem</artist>\n" +
                "<duration>4:38</duration>\n" +
                "<thumb_url>\n" +
                "https://api.androidhive.info/music/images/eminem.png\n" +
                "</thumb_url>\n" +
                "</song>\n" +
                "<song>\n" +
                "<id>23</id>\n" +
                "<title>Stranger In Moscow</title>\n" +
                "<artist>Michael Jackson</artist>\n" +
                "<duration>5:44</duration>\n" +
                "<thumb_url>https://api.androidhive.info/music/images/mj.png</thumb_url>\n" +
                "</song>\n" +
                "<song>\n" +
                "<id>24</id>\n" +
                "<title>Love The Way You Lie</title>\n" +
                "<artist>Rihanna</artist>\n" +
                "<duration>4:23</duration>\n" +
                "<thumb_url>\n" +
                "https://api.androidhive.info/music/images/rihanna.png\n" +
                "</thumb_url>\n" +
                "</song>\n" +
                "<song>\n" +
                "<id>25</id>\n" +
                "<title>Khwaja Mere Khwaja</title>\n" +
                "<artist>A R Rehman</artist>\n" +
                "<duration>6:58</duration>\n" +
                "<thumb_url>\n" +
                "https://api.androidhive.info/music/images/arrehman.png\n" +
                "</thumb_url>\n" +
                "</song>\n" +
                "<song>\n" +
                "<id>26</id>\n" +
                "<title>All My Days</title>\n" +
                "<artist>Alexi Murdoch</artist>\n" +
                "<duration>4:47</duration>\n" +
                "<thumb_url>\n" +
                "https://api.androidhive.info/music/images/alexi_murdoch.png\n" +
                "</thumb_url>\n" +
                "</song>\n" +
                "<song>\n" +
                "<id>27</id>\n" +
                "<title>Life For Rent</title>\n" +
                "<artist>Dido</artist>\n" +
                "<duration>3:41</duration>\n" +
                "<thumb_url>https://api.androidhive.info/music/images/dido.png</thumb_url>\n" +
                "</song>\n" +
                "<song>\n" +
                "<id>28</id>\n" +
                "<title>Love To See You Cry</title>\n" +
                "<artist>Enrique Iglesias</artist>\n" +
                "<duration>4:07</duration>\n" +
                "<thumb_url>\n" +
                "https://api.androidhive.info/music/images/enrique.png\n" +
                "</thumb_url>\n" +
                "</song>\n" +
                "<song>\n" +
                "<id>29</id>\n" +
                "<title>The Good, The Bad And The Ugly</title>\n" +
                "<artist>Ennio Morricone</artist>\n" +
                "<duration>2:42</duration>\n" +
                "<thumb_url>\n" +
                "https://api.androidhive.info/music/images/ennio.png\n" +
                "</thumb_url>\n" +
                "</song>\n" +
                "<song>\n" +
                "<id>30</id>\n" +
                "<title>Show me the meaning</title>\n" +
                "<artist>Backstreet Boys</artist>\n" +
                "<duration>3:56</duration>\n" +
                "<thumb_url>\n" +
                "https://api.androidhive.info/music/images/backstreet_boys.png\n" +
                "</thumb_url>\n" +
                "</song>\n" +
                "</music>";

//        try {
//            // defaultHttpClient
//            DefaultHttpClient httpClient = new DefaultHttpClient();
//            HttpPost httpPost = new HttpPost(url);
//
//            HttpResponse httpResponse = httpClient.execute(httpPost);
//            HttpEntity httpEntity = httpResponse.getEntity();
//            xml = EntityUtils.toString(httpEntity);
//
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//        } catch (ClientProtocolException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        // return XML
        return xml;
    }

//    /**
//     * Getting XML DOM element
//     * @param XML string
//     * */
    public Document getDomElement(String xml){
        Document doc = null;
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        try {

            DocumentBuilder db = dbf.newDocumentBuilder();

            InputSource is = new InputSource();
            is.setCharacterStream(new StringReader(xml));
            doc = db.parse(is);

        } catch (ParserConfigurationException e) {
            Log.e("Error: ", e.getMessage());
            return null;
        } catch (SAXException e) {
            Log.e("Error: ", e.getMessage());
            return null;
        } catch (IOException e) {
            Log.e("Error: ", e.getMessage());
            return null;
        }

        return doc;
    }

//    /** Getting node value
//     * @param elem element
//     */
    public final String getElementValue( Node elem ) {
        Node child;
        if( elem != null){
            if (elem.hasChildNodes()){
                for( child = elem.getFirstChild(); child != null; child = child.getNextSibling() ){
                    if( child.getNodeType() == Node.TEXT_NODE  ){
                        return child.getNodeValue();
                    }
                }
            }
        }
        return "";
    }

//    /**
//     * Getting node value
//     * @param Element node
//     * @param key string
//     * */
    public String getValue(Element item, String str) {
        NodeList n = item.getElementsByTagName(str);
        return this.getElementValue(n.item(0));
    }
}