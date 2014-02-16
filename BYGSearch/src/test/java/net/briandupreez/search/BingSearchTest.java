package net.briandupreez.search;

import net.briandupreez.search.bing.BingResultParser;
import net.briandupreez.search.bing.BingSearch;
import net.briandupreez.search.bing.BingSynonym;
import org.junit.Assert;
import org.junit.Test;

/**
 * Tests
 * Created by Brian on 2014/01/04.
 */
public class BingSearchTest {

    @Test
    public void testSearch() throws Exception {
        final BingSearch search = new BingSearch();
        final SearchResults result = search.search("Brian Du Preez");
        System.out.println("Results: \n" + result);
        Assert.assertNotNull(result);
        Assert.assertFalse(result.isFailed());
    }

    @Test
    public void testSynonym() throws Exception {
        final BingSynonym bingSynonym = new BingSynonym();
        final SearchSynonymResults result = bingSynonym.search("coke");
        System.out.println("Results: \n" + result);
        Assert.assertNotNull(result);
        Assert.assertFalse(result.isFailed());
    }

    @Test
    public void testBingWebResultParser() {
        final String result = "{\"d\":{\"results\":[{\"__metadata\":{\"uri\":\"https://api.datamarket.azure.com/Data.ashx/Bing/Search/v1/Web?Query=\\u0027Brian Du Preez\\u0027&$skip=0&$top=1\",\"type\":\"WebResult\"},\"ID\":\"8c763ae8-23a5-4635-abb0-75cfd700d982\",\"Title\":\"Brian du Preez - South Africa | LinkedIn\",\"Description\":\"View Brian du Preez\\u0027s (South Africa) professional profile on LinkedIn. LinkedIn is the world\\u0027s largest business network, helping professionals like Brian du Preez ...\",\"DisplayUrl\":\"za.linkedin.com/pub/brian-du-preez/36/704/707\",\"Url\":\"http://za.linkedin.com/pub/brian-du-preez/36/704/707\"},{\"__metadata\":{\"uri\":\"https://api.datamarket.azure.com/Data.ashx/Bing/Search/v1/Web?Query=\\u0027Brian Du Preez\\u0027&$skip=1&$top=1\",\"type\":\"WebResult\"},\"ID\":\"50ad6800-aad2-4944-8f95-7a79e56469fc\",\"Title\":\"Zen in the art of IT\",\"Description\":\"Posted by Brian Du Preez at 9:34 AM 0 comments. Email This BlogThis! Share to Twitter Share to Facebook. Saturday, September 7, 2013. Sourcing Twitter data, based on ...\",\"DisplayUrl\":\"www.briandupreez.net\",\"Url\":\"http://www.briandupreez.net/\"},{\"__metadata\":{\"uri\":\"https://api.datamarket.azure.com/Data.ashx/Bing/Search/v1/Web?Query=\\u0027Brian Du Preez\\u0027&$skip=2&$top=1\",\"type\":\"WebResult\"},\"ID\":\"834a50c2-ee64-4d73-97e5-4f957ea9b3ef\",\"Title\":\"Brian du Preez | LinkedIn\",\"Description\":\"View Brian du Preez\\u0027s professional profile on LinkedIn. LinkedIn is the world\\u0027s largest business network, helping professionals like Brian du Preez discover inside ...\",\"DisplayUrl\":\"www.linkedin.com/pub/brian-du-preez/56/2a8/572\",\"Url\":\"http://www.linkedin.com/pub/brian-du-preez/56/2a8/572\"},{\"__metadata\":{\"uri\":\"https://api.datamarket.azure.com/Data.ashx/Bing/Search/v1/Web?Query=\\u0027Brian Du Preez\\u0027&$skip=3&$top=1\",\"type\":\"WebResult\"},\"ID\":\"471509f0-0e97-401f-bbe4-241f4f8cfce0\",\"Title\":\"Brian Du Preez - Google+\",\"Description\":\"Brian Du Preez - Just another software developer... - Software Developer - Discovery - Johannesburg - Java and all things enterprise by day... occational Objective C ...\",\"DisplayUrl\":\"https://plus.google.com/+BrianDuPreez\",\"Url\":\"https://plus.google.com/+BrianDuPreez\"},{\"__metadata\":{\"uri\":\"https://api.datamarket.azure.com/Data.ashx/Bing/Search/v1/Web?Query=\\u0027Brian Du Preez\\u0027&$skip=4&$top=1\",\"type\":\"WebResult\"},\"ID\":\"bc8ffa56-deb1-4230-beb8-3c4288dbb9d2\",\"Title\":\"Brian du Preez | Facebook\",\"Description\":\"Brian du Preez is on Facebook. Join Facebook to connect with Brian du Preez and others you may know. Facebook gives people the power to share and makes the world more ...\",\"DisplayUrl\":\"https://www.facebook.com/brian.dupreez.3\",\"Url\":\"https://www.facebook.com/brian.dupreez.3\"},{\"__metadata\":{\"uri\":\"https://api.datamarket.azure.com/Data.ashx/Bing/Search/v1/Web?Query=\\u0027Brian Du Preez\\u0027&$skip=5&$top=1\",\"type\":\"WebResult\"},\"ID\":\"93693889-c7a9-49bd-8e35-e57f83965606\",\"Title\":\"Brian Du Preez, lawyer in Johannesburg - 36lawyers.co.za\",\"Description\":\"Phone and address of Brian Du Preez, Johannesburg (2001). Directory of lawyers in Johannesburg Metro\",\"DisplayUrl\":\"36lawyers.co.za/directory/brian-du-preez\",\"Url\":\"http://36lawyers.co.za/directory/brian-du-preez\"},{\"__metadata\":{\"uri\":\"https://api.datamarket.azure.com/Data.ashx/Bing/Search/v1/Web?Query=\\u0027Brian Du Preez\\u0027&$skip=6&$top=1\",\"type\":\"WebResult\"},\"ID\":\"bed24bab-44c1-4ed9-971f-27a3e0ec2d59\",\"Title\":\"Brian Du Preez (bdupreez) on Twitter\",\"Description\":\"The latest from Brian Du Preez (@bdupreez). Code. Code. Code. Java EE by day. Machine Learning & AI by night. Johannesburg, South Africa\",\"DisplayUrl\":\"twitter.com/bdupreez\",\"Url\":\"http://twitter.com/bdupreez\"},{\"__metadata\":{\"uri\":\"https://api.datamarket.azure.com/Data.ashx/Bing/Search/v1/Web?Query=\\u0027Brian Du Preez\\u0027&$skip=7&$top=1\",\"type\":\"WebResult\"},\"ID\":\"fc673092-31bd-431f-b14c-8df16da5c8b1\",\"Title\":\"Brian du Preez\",\"Description\":\"Brian du Preez - .Brian du Preez is on Loads 4 Africa - Where South African Transporters meet truck contracts. Join Loads 4 Africa - Where South African Transporters ...\",\"DisplayUrl\":\"www.loads4africa.co.za/profile/6308-brian-du-preez\",\"Url\":\"http://www.loads4africa.co.za/profile/6308-brian-du-preez\"},{\"__metadata\":{\"uri\":\"https://api.datamarket.azure.com/Data.ashx/Bing/Search/v1/Web?Query=\\u0027Brian Du Preez\\u0027&$skip=8&$top=1\",\"type\":\"WebResult\"},\"ID\":\"e1fa825a-aa82-44bb-a8a7-f8f5813e4032\",\"Title\":\"Zen in the art of IT: Hazelcast - a simple distributed caching ...\",\"Description\":\"Brian Du Preez Java and all things enterprise by day... occational Objective C, iOS game development and recently AI, Machine Learning and all that goes with it at ...\",\"DisplayUrl\":\"www.briandupreez.net/2010/09/hazelcast-simple-distributed-caching.html\",\"Url\":\"http://www.briandupreez.net/2010/09/hazelcast-simple-distributed-caching.html\"},{\"__metadata\":{\"uri\":\"https://api.datamarket.azure.com/Data.ashx/Bing/Search/v1/Web?Query=\\u0027Brian Du Preez\\u0027&$skip=9&$top=1\",\"type\":\"WebResult\"},\"ID\":\"37dcb15e-f379-4748-b244-5c2179832c9e\",\"Title\":\"Brian Du Preez - Email address, photos, phone numbers to Brian ...\",\"Description\":\"Information about Brian Du Preez like photos, contact information, job and many more on ...\",\"DisplayUrl\":\"www.vebidoo.com/brian+du+preez\",\"Url\":\"http://www.vebidoo.com/brian+du+preez\"},{\"__metadata\":{\"uri\":\"https://api.datamarket.azure.com/Data.ashx/Bing/Search/v1/Web?Query=\\u0027Brian Du Preez\\u0027&$skip=10&$top=1\",\"type\":\"WebResult\"},\"ID\":\"64195138-b9ec-45a6-a396-f6a4d063ed0b\",\"Title\":\"brian du preez - Google+\",\"Description\":\"brian du preez hasn\\u0027t shared anything on this page with you.\",\"DisplayUrl\":\"https://plus.google.com/108795270228547525184\",\"Url\":\"https://plus.google.com/108795270228547525184\"},{\"__metadata\":{\"uri\":\"https://api.datamarket.azure.com/Data.ashx/Bing/Search/v1/Web?Query=\\u0027Brian Du Preez\\u0027&$skip=11&$top=1\",\"type\":\"WebResult\"},\"ID\":\"1a70fa36-7831-43a8-8e43-4ff0cdf58900\",\"Title\":\"Brian du Preez - Genealogy\",\"Description\":\"View Brian du Preez\\u0027s genealogy on Geni helping Brian du Preez and others research their family trees, with over 100 million profiles of ancestors and living relatives.\",\"DisplayUrl\":\"www.geni.com/people/Brian-du-Preez/6000000016934733665\",\"Url\":\"http://www.geni.com/people/Brian-du-Preez/6000000016934733665\"},{\"__metadata\":{\"uri\":\"https://api.datamarket.azure.com/Data.ashx/Bing/Search/v1/Web?Query=\\u0027Brian Du Preez\\u0027&$skip=12&$top=1\",\"type\":\"WebResult\"},\"ID\":\"64c6c415-8d08-46b4-9074-f04f941d3480\",\"Title\":\"Alwyn Brian Du Preez | Facebook\",\"Description\":\"Alwyn Brian Du Preez is on Facebook. Join Facebook to connect with Alwyn Brian Du Preez and others you may know. Facebook gives people the power to share and makes ...\",\"DisplayUrl\":\"https://www.facebook.com/alwyn.b.preez\",\"Url\":\"https://www.facebook.com/alwyn.b.preez\"},{\"__metadata\":{\"uri\":\"https://api.datamarket.azure.com/Data.ashx/Bing/Search/v1/Web?Query=\\u0027Brian Du Preez\\u0027&$skip=13&$top=1\",\"type\":\"WebResult\"},\"ID\":\"26aa14a8-2b50-419e-b854-1daab86d7ae9\",\"Title\":\"A B Du Preez Insurance Consultants – Brokers Profile ...\",\"Description\":\"Region: Gauteng. City: Roodepoort. Contact Person: Brian Du Preez. Phone: 011 672 8925. Mobile: 083 266 5554. Fax: 011 672 2280. Physical Address: 98 Kruger Avenue ...\",\"DisplayUrl\":\"www.etana.co.za/brokers/entry/a-b-du-preez-insurance-consultants\",\"Url\":\"http://www.etana.co.za/brokers/entry/a-b-du-preez-insurance-consultants\"},{\"__metadata\":{\"uri\":\"https://api.datamarket.azure.com/Data.ashx/Bing/Search/v1/Web?Query=\\u0027Brian Du Preez\\u0027&$skip=14&$top=1\",\"type\":\"WebResult\"},\"ID\":\"e80a0f62-e8fe-48ef-a6f5-114b825f3bbc\",\"Title\":\"Attorney: Michelle du Preez at Brian Kahn Incorporated ...\",\"Description\":\"Michelle du Preez at Brian Kahn Incorporated Attorneys (Craighall Park, Sandton) attorneys in Gauteng / Johannesburg\",\"DisplayUrl\":\"www.attorneys.co.za/AttorneyHomePage.asp?AttorneyID=2841\",\"Url\":\"http://www.attorneys.co.za/AttorneyHomePage.asp?AttorneyID=2841\"},{\"__metadata\":{\"uri\":\"https://api.datamarket.azure.com/Data.ashx/Bing/Search/v1/Web?Query=\\u0027Brian Du Preez\\u0027&$skip=15&$top=1\",\"type\":\"WebResult\"},\"ID\":\"55756d01-e346-482c-bb4f-1228353e8dd2\",\"Title\":\"Brian Du Preez - Quora\",\"Description\":\"Quora is your best source for knowledge. There are some updates to this page that haven\\u0027t been applied yet because you\\u0027ve entered some data into a form.\",\"DisplayUrl\":\"www.quora.com/Brian-Du-Preez\",\"Url\":\"http://www.quora.com/Brian-Du-Preez\"},{\"__metadata\":{\"uri\":\"https://api.datamarket.azure.com/Data.ashx/Bing/Search/v1/Web?Query=\\u0027Brian Du Preez\\u0027&$skip=16&$top=1\",\"type\":\"WebResult\"},\"ID\":\"7068eec1-acc6-405e-a821-33eb26cdd359\",\"Title\":\"Du Preez included in Springbok squad - I Love The Springboks\",\"Description\":\"Du Preez included in Springbok squad. This entry was posted by Brian Bush on August 4, 2013 at 1:50 am\",\"DisplayUrl\":\"www.ilovethespringboks.co.za/du-preez-included-in-springbok-squad\",\"Url\":\"http://www.ilovethespringboks.co.za/du-preez-included-in-springbok-squad/\"},{\"__metadata\":{\"uri\":\"https://api.datamarket.azure.com/Data.ashx/Bing/Search/v1/Web?Query=\\u0027Brian Du Preez\\u0027&$skip=17&$top=1\",\"type\":\"WebResult\"},\"ID\":\"6024b37d-2294-4d71-88c8-247113348c2f\",\"Title\":\"two Part Drools and Guvnor Tutorial (Brian Du Preez) | Drools ...\",\"Description\":\"Part 1 (Brian Du Preez) Part 2 (Brian Du Preez) Part 1 (Excerpt - Brian Du Preez) This series of posts will be about me getting to grips with JBoss Drools.\",\"DisplayUrl\":\"planet.jboss.org/post/two_part_drools_and_guvnor_tutorial_brian_du...\",\"Url\":\"http://planet.jboss.org/post/two_part_drools_and_guvnor_tutorial_brian_du_preez\"},{\"__metadata\":{\"uri\":\"https://api.datamarket.azure.com/Data.ashx/Bing/Search/v1/Web?Query=\\u0027Brian Du Preez\\u0027&$skip=18&$top=1\",\"type\":\"WebResult\"},\"ID\":\"1931321e-806b-4788-8648-6c2c3388540f\",\"Title\":\"Two Part Drools and Guvnor Tutorial (Brian Du Preez)\",\"Description\":\"Part 1 (Brian Du Preez) Part 2 (Brian Du Preez) Part 1 (Excerpt - Brian Du Preez) This series of posts will be about me getting to grips with JBoss Drools.\",\"DisplayUrl\":\"blog.athico.com/2011/01/two-part-drools-and-guvnor-tutorial.html\",\"Url\":\"http://blog.athico.com/2011/01/two-part-drools-and-guvnor-tutorial.html\"},{\"__metadata\":{\"uri\":\"https://api.datamarket.azure.com/Data.ashx/Bing/Search/v1/Web?Query=\\u0027Brian Du Preez\\u0027&$skip=19&$top=1\",\"type\":\"WebResult\"},\"ID\":\"044955d8-d1a6-495d-9ce0-8d1e2871db02\",\"Title\":\"Ward 53 l DA Local Branch\",\"Description\":\"Pierre du Preez (Chair) Debbie James (Secretary) Liz Barnett (Treasurer) Brian Watkyns (Councillor) Penny Franzidis Catherine Neiuwveld Harold Winearles\",\"DisplayUrl\":\"www.brianwatkyns.co.za/DA%20Local%20Branch.html\",\"Url\":\"http://www.brianwatkyns.co.za/DA%20Local%20Branch.html\"},{\"__metadata\":{\"uri\":\"https://api.datamarket.azure.com/Data.ashx/Bing/Search/v1/Web?Query=\\u0027Brian Du Preez\\u0027&$skip=20&$top=1\",\"type\":\"WebResult\"},\"ID\":\"362f5148-80ea-49ac-a549-34474208303d\",\"Title\":\"DA Local Branch\",\"Description\":\"COMMITTEE MEMBERS. Pierre du Preez (Chair) Brian Watkyns(Vice Chair) Debbie James (Secretary) Liz Barnett (Treasurer) Penny Franzidis. Mike Tomlinson\",\"DisplayUrl\":\"myhome.mweb.co.za/~bwatkyns/html/da_local_branch.html\",\"Url\":\"http://myhome.mweb.co.za/~bwatkyns/html/da_local_branch.html\"},{\"__metadata\":{\"uri\":\"https://api.datamarket.azure.com/Data.ashx/Bing/Search/v1/Web?Query=\\u0027Brian Du Preez\\u0027&$skip=21&$top=1\",\"type\":\"WebResult\"},\"ID\":\"ec637ef4-921f-4d7d-a5fc-11ae4dad4bd3\",\"Title\":\"Netcute Details\",\"Description\":\"Baby\\u0027s Name: Amber-Lee Du Preez: Mom & Dad : Anjeliek & Brian : Date of Birth : 19 Feb 2013: Time of Birth : 16h04: Hospital: Netcare St Anne\\u0027s Hospital: Weight: 3,09kg\",\"DisplayUrl\":\"www.netcare.co.za/live/netcare_content.php?Item_ID=121&BabyID=216964\",\"Url\":\"http://www.netcare.co.za/live/netcare_content.php?Item_ID=121&BabyID=216964\"},{\"__metadata\":{\"uri\":\"https://api.datamarket.azure.com/Data.ashx/Bing/Search/v1/Web?Query=\\u0027Brian Du Preez\\u0027&$skip=22&$top=1\",\"type\":\"WebResult\"},\"ID\":\"8d51befc-4b9c-4629-8865-24c2a98f1d86\",\"Title\":\"www.wikio.co.uk\",\"Description\":\"We would like to show you a description here but the site won’t allow us.\",\"DisplayUrl\":\"www.wikio.co.uk/sport/rugby/rugby_players/fourie_du_preez\",\"Url\":\"http://www.wikio.co.uk/sport/rugby/rugby_players/fourie_du_preez\"},{\"__metadata\":{\"uri\":\"https://api.datamarket.azure.com/Data.ashx/Bing/Search/v1/Web?Query=\\u0027Brian Du Preez\\u0027&$skip=23&$top=1\",\"type\":\"WebResult\"},\"ID\":\"3fb2c963-3732-4455-92ed-62b12dc77f15\",\"Title\":\"• Booyens Du Preez En Boshoff Ing • Louis Trichardt ...\",\"Description\":\"★ Booyens Du Preez En Boshoff Ing ★ 28 B Landros Avenue, Louis Trichardt, Limpopo, 155161404 ★ Lawyers, Legal Services\",\"DisplayUrl\":\"www.tuugo.co.za/Companies/booyens-du-preez-en-boshoff-ing\",\"Url\":\"http://www.tuugo.co.za/Companies/booyens-du-preez-en-boshoff-ing/0260001630422\"},{\"__metadata\":{\"uri\":\"https://api.datamarket.azure.com/Data.ashx/Bing/Search/v1/Web?Query=\\u0027Brian Du Preez\\u0027&$skip=24&$top=1\",\"type\":\"WebResult\"},\"ID\":\"7df80722-72db-45b3-ac0d-251e66eb391b\",\"Title\":\"• Brian Packaging Services • Florida • Wes-Kaap •\",\"Description\":\"★ Brian Packaging Services ★ 9 Sonneblom Av, Florida, Wes-Kaap, 116751681 ★ Packaging, ... Distribution & Packaging Brian Du Preez Sonia Howard.\",\"DisplayUrl\":\"www.tuugo.co.za/Companies/brian-packaging-services\",\"Url\":\"http://www.tuugo.co.za/Companies/brian-packaging-services/0260001471502\"},{\"__metadata\":{\"uri\":\"https://api.datamarket.azure.com/Data.ashx/Bing/Search/v1/Web?Query=\\u0027Brian Du Preez\\u0027&$skip=25&$top=1\",\"type\":\"WebResult\"},\"ID\":\"0c7a71d1-19fa-4372-82d2-9d099323ff5e\",\"Title\":\"Koos du Preez\\u0027s Page - Unified Team Diving\",\"Description\":\"Koos du Preez and Brian Wiederspan are now friends. Jun 1, 2010. Koos du Preez replied to Brian Wiederspan\\u0027s discussion Welcome! in the group UTD - Pacific Northwest\",\"DisplayUrl\":\"www.unifiedteamdiving.com/profile/KoosduPreez\",\"Url\":\"http://www.unifiedteamdiving.com/profile/KoosduPreez\"},{\"__metadata\":{\"uri\":\"https://api.datamarket.azure.com/Data.ashx/Bing/Search/v1/Web?Query=\\u0027Brian Du Preez\\u0027&$skip=26&$top=1\",\"type\":\"WebResult\"},\"ID\":\"4874f0bf-e999-436f-8174-aa003ee8382d\",\"Title\":\"Java Code Geeks » Brian Du Preez\",\"Description\":\"Continuing with Programming Collection Intelligence (PCI) the next exercise was using the distance scores to pigeonhole a list of blogs based on the words used within ...\",\"DisplayUrl\":\"www.javacodegeeks.com/author/Brian-Du-Preez/feed\",\"Url\":\"http://www.javacodegeeks.com/author/Brian-Du-Preez/feed/\"},{\"__metadata\":{\"uri\":\"https://api.datamarket.azure.com/Data.ashx/Bing/Search/v1/Web?Query=\\u0027Brian Du Preez\\u0027&$skip=27&$top=1\",\"type\":\"WebResult\"},\"ID\":\"41ff5ee1-8a2b-4aeb-ab83-1bf13cc30fb0\",\"Title\":\"Fourie du Preez | Rugby Universe\",\"Description\":\"Posts about Fourie du Preez written by johnevely21 ... By John Evely After fielding a largely unknown side for the first game of the Tri-Nations because of injury ...\",\"DisplayUrl\":\"rugbyuniverse.net/tag/fourie-du-preez\",\"Url\":\"http://rugbyuniverse.net/tag/fourie-du-preez/\"},{\"__metadata\":{\"uri\":\"https://api.datamarket.azure.com/Data.ashx/Bing/Search/v1/Web?Query=\\u0027Brian Du Preez\\u0027&$skip=28&$top=1\",\"type\":\"WebResult\"},\"ID\":\"05d7ef83-98a8-46f9-b3a7-d433d7354ea3\",\"Title\":\"Du Preez, Steyn up for top IRB award - SouthAfrica.info\",\"Description\":\"At the beginning of the month, Fourie du Preez was named South Africa\\u0027s Rugby Player of the Year for the second time. Now, along with Francois Steyn, he has been ...\",\"DisplayUrl\":\"www.southafrica.info/news/sport/rugby-171109.htm\",\"Url\":\"http://www.southafrica.info/news/sport/rugby-171109.htm\"},{\"__metadata\":{\"uri\":\"https://api.datamarket.azure.com/Data.ashx/Bing/Search/v1/Web?Query=\\u0027Brian Du Preez\\u0027&$skip=29&$top=1\",\"type\":\"WebResult\"},\"ID\":\"13392325-63e3-473e-9bc8-f8c614cb3f33\",\"Title\":\"Jan L du Preez - research profile on BiomedExperts\",\"Description\":\"Jan du Preez - research profile on BiomedExperts:Social Isolation, Kynurenine, Oxidative Stress, Solubility, Clozapine, High Pressure Liquid Chromatography.\",\"DisplayUrl\":\"www.biomedexperts.com/Profile.bme/343648/Jan_L_du_Preez\",\"Url\":\"http://www.biomedexperts.com/Profile.bme/343648/Jan_L_du_Preez\"},{\"__metadata\":{\"uri\":\"https://api.datamarket.azure.com/Data.ashx/Bing/Search/v1/Web?Query=\\u0027Brian Du Preez\\u0027&$skip=30&$top=1\",\"type\":\"WebResult\"},\"ID\":\"9f7802f9-3a08-4bda-92c4-8f21e8089e45\",\"Title\":\"Ab Du Preez Insurance Consultants, Florida Johannesburg, 98 ...\",\"Description\":\"Ab Du Preez Insurance Consultants, 98 Kruger Avenue Dicovery in Florida Johannesburg Discovery, Phone 0832665554 with Contact person and Driving directions\",\"DisplayUrl\":\"www.cylex.co.za/company/ab-du-preez-insurance-consultants-18850649...\",\"Url\":\"http://www.cylex.co.za/company/ab-du-preez-insurance-consultants-18850649.html\"},{\"__metadata\":{\"uri\":\"https://api.datamarket.azure.com/Data.ashx/Bing/Search/v1/Web?Query=\\u0027Brian Du Preez\\u0027&$skip=31&$top=1\",\"type\":\"WebResult\"},\"ID\":\"7c2adbe4-71f0-4f98-9309-e26658014796\",\"Title\":\"Kwanalu - Kwazulu-Natal Agricultural Union\",\"Description\":\"Max du Preez, speaker at the 2013 Congress, answering questions posed by delegates. Outgoing President Brian Aitken in conversation with Max du Preez.\",\"DisplayUrl\":\"www.kwanalu.co.za/default.asp?id=1446\",\"Url\":\"http://www.kwanalu.co.za/default.asp?id=1446\"},{\"__metadata\":{\"uri\":\"https://api.datamarket.azure.com/Data.ashx/Bing/Search/v1/Web?Query=\\u0027Brian Du Preez\\u0027&$skip=32&$top=1\",\"type\":\"WebResult\"},\"ID\":\"89f41df0-cf5b-426c-865b-eb117555b5cf\",\"Title\":\"Du Preez remains humble | Sport24 - SPORT24 - On top of your game\",\"Description\":\"He is humble about being honoured, but even Fourie du Preez has to admit that he deserved to be named player of the year.\",\"DisplayUrl\":\"www.sport24.co.za/Rugby/Du-Preez-remains-humble-20091103\",\"Url\":\"http://www.sport24.co.za/Rugby/Du-Preez-remains-humble-20091103\"},{\"__metadata\":{\"uri\":\"https://api.datamarket.azure.com/Data.ashx/Bing/Search/v1/Web?Query=\\u0027Brian Du Preez\\u0027&$skip=33&$top=1\",\"type\":\"WebResult\"},\"ID\":\"31d12978-2a40-44ba-aa03-6be66702b9ca\",\"Title\":\"Madikelo Archery Pictures\",\"Description\":\"Roelf du Preez with his first self-made bow . Mpumalanga Target Archery 2006 . Back: Roelf & Kobie du Preez, Jorina & Jacques Coetzee, Louan Groenewald\",\"DisplayUrl\":\"home.global.co.za/~peabrain/archery_pics.htm\",\"Url\":\"http://home.global.co.za/~peabrain/archery_pics.htm\"},{\"__metadata\":{\"uri\":\"https://api.datamarket.azure.com/Data.ashx/Bing/Search/v1/Web?Query=\\u0027Brian Du Preez\\u0027&$skip=34&$top=1\",\"type\":\"WebResult\"},\"ID\":\"2ad05482-fd9c-4085-ae18-71ba90b1c366\",\"Title\":\"JJ du Preez High School 1960\\u0027s Reunion 1990 - photos\",\"Description\":\"CLASS OF 1960 REUNION SAT. 29th SEPTEMBER 1990: Talking 10: Dick Etheridge, Brian Butler and Rodney Friend (all 1960). (Scroll down for links to other pages and sections)\",\"DisplayUrl\":\"pdhs-jjdupreez.co.za/1990-09-29-reun-co1960-talking10.htm\",\"Url\":\"http://pdhs-jjdupreez.co.za/1990-09-29-reun-co1960-talking10.htm\"},{\"__metadata\":{\"uri\":\"https://api.datamarket.azure.com/Data.ashx/Bing/Search/v1/Web?Query=\\u0027Brian Du Preez\\u0027&$skip=35&$top=1\",\"type\":\"WebResult\"},\"ID\":\"2cc60f30-ab0e-4c9d-94ac-5c6ba0e39253\",\"Title\":\"IRB nominate Steyn, Du Preez | Sport24 - SPORT24 - On top of ...\",\"Description\":\"Springbok duo Francois Steyn and Fourie du Preez have been shortlisted for the IRB Player of the Year award.\",\"DisplayUrl\":\"www.sport24.co.za/Rugby/IRB-nominate-Steyn-Du-Preez-20091116\",\"Url\":\"http://www.sport24.co.za/Rugby/IRB-nominate-Steyn-Du-Preez-20091116\"},{\"__metadata\":{\"uri\":\"https://api.datamarket.azure.com/Data.ashx/Bing/Search/v1/Web?Query=\\u0027Brian Du Preez\\u0027&$skip=36&$top=1\",\"type\":\"WebResult\"},\"ID\":\"c1d259c6-3430-49c0-aeec-92f8d728c33b\",\"Title\":\"Insider: Fourie du Preez - SuperSport - Rugby\",\"Description\":\"The recent recall of Fourie du Preez to the Springbok squad should not have been as a big a shock as it seems to have been to some people. After all, Du Preez, the ...\",\"DisplayUrl\":\"www.superrugby.co.za/rugby/insider/news/130812/Insider_Fourie_du_Preez\",\"Url\":\"http://www.superrugby.co.za/rugby/insider/news/130812/Insider_Fourie_du_Preez\"},{\"__metadata\":{\"uri\":\"https://api.datamarket.azure.com/Data.ashx/Bing/Search/v1/Web?Query=\\u0027Brian Du Preez\\u0027&$skip=37&$top=1\",\"type\":\"WebResult\"},\"ID\":\"248bd3be-8770-4565-9292-c80f93842de5\",\"Title\":\"Werner du Preez (WernerduPreez) on Twitter\",\"Description\":\"The latest from Werner du Preez (@WernerduPreez). IT guy at BusinessPrint, business partner, MTB\\u0027er, coffee drinker, wine lover, opinionated, wanna be right brain ...\",\"DisplayUrl\":\"twitter.com/WernerduPreez\",\"Url\":\"http://twitter.com/WernerduPreez\"},{\"__metadata\":{\"uri\":\"https://api.datamarket.azure.com/Data.ashx/Bing/Search/v1/Web?Query=\\u0027Brian Du Preez\\u0027&$skip=38&$top=1\",\"type\":\"WebResult\"},\"ID\":\"43e21524-1161-4ad9-806f-2c6c478ae92c\",\"Title\":\"Rhodesian Sport Profiles: John Harcourt (Jackie) du Preez\",\"Description\":\"At the age of seven he began bowling natural leg-spinners in a dusty Glendale farmyard. At the age of thirty-six, in September 1979, Jackie du Preez became ...\",\"DisplayUrl\":\"rhodesiansportprofiles.blogspot.com/2012/08/john-harcourt-jackie...\",\"Url\":\"http://rhodesiansportprofiles.blogspot.com/2012/08/john-harcourt-jackie-du-preez.html\"},{\"__metadata\":{\"uri\":\"https://api.datamarket.azure.com/Data.ashx/Bing/Search/v1/Web?Query=\\u0027Brian Du Preez\\u0027&$skip=39&$top=1\",\"type\":\"WebResult\"},\"ID\":\"8bc971ee-0145-4092-a8ea-f10bcbab27cf\",\"Title\":\"Du Preez - Pipl Directory\",\"Description\":\"Get Information for Du Preez, Profile Photos, Address History, Phone Numbers, Relatives, Education, Publications and more\",\"DisplayUrl\":\"https://pipl.com/directory/name/Du%20Preez/1880\",\"Url\":\"https://pipl.com/directory/name/Du%20Preez/1880/\"},{\"__metadata\":{\"uri\":\"https://api.datamarket.azure.com/Data.ashx/Bing/Search/v1/Web?Query=\\u0027Brian Du Preez\\u0027&$skip=40&$top=1\",\"type\":\"WebResult\"},\"ID\":\"8d191870-aabe-4a93-8b5d-193d81ee96d4\",\"Title\":\"Frik du Preez - Wikipedia, the free encyclopedia\",\"Description\":\"Frederik Christoffel Hendrik \\\"Frik\\\" du Preez (born 28 November 1935 in Rustenburg, South Africa) is a former South African rugby union player who represented Northern ...\",\"DisplayUrl\":\"en.wikipedia.org/wiki/Frik_du_Preez\",\"Url\":\"http://en.wikipedia.org/wiki/Frik_du_Preez\"},{\"__metadata\":{\"uri\":\"https://api.datamarket.azure.com/Data.ashx/Bing/Search/v1/Web?Query=\\u0027Brian Du Preez\\u0027&$skip=41&$top=1\",\"type\":\"WebResult\"},\"ID\":\"d80e68aa-2913-47e1-bb1d-73f6acb2d06e\",\"Title\":\"PDHS-JJ du Preez high School - through the years: 1956\",\"Description\":\"John Griessen, Brian Butler, Theo(??) Liebenberg, Ivor(?) Raymond. RIGHT GROUP: Back row: Edwin Oliver, Edward Reeves; Next row: Colin Langeveld; Next row: ??\",\"DisplayUrl\":\"pdhs-jjdupreez.co.za/1956-std6g-boys.htm\",\"Url\":\"http://pdhs-jjdupreez.co.za/1956-std6g-boys.htm\"},{\"__metadata\":{\"uri\":\"https://api.datamarket.azure.com/Data.ashx/Bing/Search/v1/Web?Query=\\u0027Brian Du Preez\\u0027&$skip=42&$top=1\",\"type\":\"WebResult\"},\"ID\":\"2ff45e5c-a7b2-4801-9b45-84fb01d26047\",\"Title\":\"Frik Du Preez\",\"Description\":\"Legendary South African forward Frik Du Preez was an archetypal player. He loved the game beyond all else. Not even the oppressive shadow of Apartheid, which darkened ...\",\"DisplayUrl\":\"www.rfu.com/twickenhamstadium/worldrugbymuseum/walloffame/frikdupreez\",\"Url\":\"http://www.rfu.com/twickenhamstadium/worldrugbymuseum/walloffame/frikdupreez\"},{\"__metadata\":{\"uri\":\"https://api.datamarket.azure.com/Data.ashx/Bing/Search/v1/Web?Query=\\u0027Brian Du Preez\\u0027&$skip=43&$top=1\",\"type\":\"WebResult\"},\"ID\":\"0aa32270-d056-4924-81df-e9f5805d55c1\",\"Title\":\"Dierama pendulum\",\"Description\":\"Dierama pendulum, Glenwood House Wetland George, Western Cape, South Africa. [image Brian du Preez ©, from iSpot]\",\"DisplayUrl\":\"www.biodiversityexplorer.org/plants/iridaceae/dierama_pendulum.htm\",\"Url\":\"http://www.biodiversityexplorer.org/plants/iridaceae/dierama_pendulum.htm\"},{\"__metadata\":{\"uri\":\"https://api.datamarket.azure.com/Data.ashx/Bing/Search/v1/Web?Query=\\u0027Brian Du Preez\\u0027&$skip=44&$top=1\",\"type\":\"WebResult\"},\"ID\":\"5c704cb7-a8da-4db3-aa4b-195b6f52788c\",\"Title\":\"Liza Du Preez - Australia | LinkedIn\",\"Description\":\"View Liza Du Preez\\u0027s (Australia) professional profile on LinkedIn. LinkedIn is the world\\u0027s largest business network, helping professionals like Liza Du Preez discover ...\",\"DisplayUrl\":\"au.linkedin.com/pub/liza-du-preez/11/1a5/904\",\"Url\":\"http://au.linkedin.com/pub/liza-du-preez/11/1a5/904\"},{\"__metadata\":{\"uri\":\"https://api.datamarket.azure.com/Data.ashx/Bing/Search/v1/Web?Query=\\u0027Brian Du Preez\\u0027&$skip=45&$top=1\",\"type\":\"WebResult\"},\"ID\":\"aed9283d-63fa-4e31-8544-d2be81aee087\",\"Title\":\"Disabled athlete is suing for R5.2m - Post | IOL.co.za\",\"Description\":\"Lizet du Preez and her mother, Elsab , at the Western Cape High Court. ... becoming brain damaged. Runner Lizet du Preez, 39, of Barberton in Mpumalanga, ...\",\"DisplayUrl\":\"www.thepost.co.za/disabled-athlete-is-suing-for-r5-2m-1.1302828\",\"Url\":\"http://www.thepost.co.za/disabled-athlete-is-suing-for-r5-2m-1.1302828\"},{\"__metadata\":{\"uri\":\"https://api.datamarket.azure.com/Data.ashx/Bing/Search/v1/Web?Query=\\u0027Brian Du Preez\\u0027&$skip=46&$top=1\",\"type\":\"WebResult\"},\"ID\":\"78478c07-3229-4432-9e91-f7f9618d1da0\",\"Title\":\"IOL | News for South Africa and the world\",\"Description\":\"Lizet du Preez and her mother, Elsab , at the Western Cape High Court. ... becoming brain damaged. Runner Lizet du Preez, 39, of Barberton in Mpumalanga, ...\",\"DisplayUrl\":\"www.iol.co.za/news/crime-courts/disabled-athlete-is-suing-for-r5-2...\",\"Url\":\"http://www.iol.co.za/news/crime-courts/disabled-athlete-is-suing-for-r5-2m-1.1302828?ot=inmsa.ArticlePrintPageLayout.ot\"},{\"__metadata\":{\"uri\":\"https://api.datamarket.azure.com/Data.ashx/Bing/Search/v1/Web?Query=\\u0027Brian Du Preez\\u0027&$skip=47&$top=1\",\"type\":\"WebResult\"},\"ID\":\"7bd9663f-5c3b-4f32-b1bf-975c6bb940d4\",\"Title\":\"Jaco Du Preez - Australia | LinkedIn\",\"Description\":\"View Jaco Du Preez\\u0027s (Australia) professional profile on LinkedIn. LinkedIn is the world\\u0027s largest business network, helping professionals like Jaco Du Preez discover ...\",\"DisplayUrl\":\"au.linkedin.com/pub/jaco-du-preez/5b/836/391\",\"Url\":\"http://au.linkedin.com/pub/jaco-du-preez/5b/836/391\"},{\"__metadata\":{\"uri\":\"https://api.datamarket.azure.com/Data.ashx/Bing/Search/v1/Web?Query=\\u0027Brian Du Preez\\u0027&$skip=48&$top=1\",\"type\":\"WebResult\"},\"ID\":\"06a017f4-54d7-4f9c-862e-71e1dbe89bc0\",\"Title\":\"IOL | News for South Africa and the world\",\"Description\":\"Lizet du Preez and her mother, Elsabe, at the Western Cape High Court. ... becoming brain damaged. Runner Lizet du Preez, 39, of Barberton in Mpumalanga, ...\",\"DisplayUrl\":\"www.iol.co.za/capeargus/disabled-athlete-sues-home-owner-for-r5-2m...\",\"Url\":\"http://www.iol.co.za/capeargus/disabled-athlete-sues-home-owner-for-r5-2m-1.1303190?ot=inmsa.ArticlePrintPageLayout.ot\"},{\"__metadata\":{\"uri\":\"https://api.datamarket.azure.com/Data.ashx/Bing/Search/v1/Web?Query=\\u0027Brian Du Preez\\u0027&$skip=49&$top=1\",\"type\":\"WebResult\"},\"ID\":\"239f825b-603e-43e1-92f4-c0c734b3d514\",\"Title\":\"About Us\",\"Description\":\"Vivienne du Preez studied fine art at the Ruth Prowse School of Art in Cape Town in 1993, specializing in sculpture, life drawing and illustration.\",\"DisplayUrl\":\"www.ondesign.co.za/Home/About?ajax=1\",\"Url\":\"http://www.ondesign.co.za/Home/About?ajax=1\"}],\"__next\":\"https://api.datamarket.azure.com/Data.ashx/Bing/Search/v1/Web?Query=\\u0027Brian%20Du%20Preez\\u0027&$skip=50\"}}";
        final BingResultParser resultParser = new BingResultParser();
        final SearchResults searchResults = resultParser.parseWeb("Brian Du Preez", result);
        System.out.println("Parsed Results: \n" + searchResults);

    }

    @Test
    public void testBingSynonymResultParser() {
        final String result = "{\"d\":{\"results\":[{\"__metadata\":{\"uri\":\"https://api.datamarket.azure.com/Data.ashx/Bing/Synonyms/v1/GetSynonyms?Query='coke'&$skip=0&$top=1\",\"type\":\"GetSynonymsEntitySet\"},\"Synonym\":\"coca cola\"},{\"__metadata\":{\"uri\":\"https://api.datamarket.azure.com/Data.ashx/Bing/Synonyms/v1/GetSynonyms?Query='coke'&$skip=1&$top=1\",\"type\":\"GetSynonymsEntitySet\"},\"Synonym\":\"cokes\"},{\"__metadata\":{\"uri\":\"https://api.datamarket.azure.com/Data.ashx/Bing/Synonyms/v1/GetSynonyms?Query='coke'&$skip=2&$top=1\",\"type\":\"GetSynonymsEntitySet\"},\"Synonym\":\"coke cola\"},{\"__metadata\":{\"uri\":\"https://api.datamarket.azure.com/Data.ashx/Bing/Synonyms/v1/GetSynonyms?Query='coke'&$skip=3&$top=1\",\"type\":\"GetSynonymsEntitySet\"},\"Synonym\":\"cocacola\"},{\"__metadata\":{\"uri\":\"https://api.datamarket.azure.com/Data.ashx/Bing/Synonyms/v1/GetSynonyms?Query='coke'&$skip=4&$top=1\",\"type\":\"GetSynonymsEntitySet\"},\"Synonym\":\"cokacola\"}]}}";
        final BingResultParser bingResultParser = new BingResultParser();
        final SearchSynonymResults synonymResults = bingResultParser.parseSynonym("coke", result);
        System.out.println("Parsed Results: \n" + synonymResults);
    }
}