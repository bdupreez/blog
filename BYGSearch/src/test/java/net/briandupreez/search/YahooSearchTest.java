package net.briandupreez.search;


import net.briandupreez.search.yahoo.YahooResultParser;
import net.briandupreez.search.yahoo.YahooSearch;
import org.apache.log4j.BasicConfigurator;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test Yahoo
 * Created by Brian on 2014/01/04.
 */
public class YahooSearchTest {
    @Test
    public void testYahooWebSearch() throws Exception {
        BasicConfigurator.configure();
        final YahooSearch yahooSearch = new YahooSearch();
        final SearchResults yahoo = yahooSearch.search("Brian Du Preez");
        System.out.println(yahoo);
        Assert.assertFalse(yahoo.isFailed());

    }

    @Test
    public void testYahooWebParser() throws Exception {

        final String results = "{\"bossresponse\":{\"responsecode\":\"200\",\"web\":{\"start\":\"0\",\"count\":\"50\",\"totalresults\":\"356000000\",\"results\":[{\"date\":\"\",\"clickurl\":\"http:\\/\\/www.yahoo.com\\/\",\"url\":\"http:\\/\\/www.yahoo.com\\/\",\"dispurl\":\"www.<b>yahoo<\\/b>.com\",\"title\":\"<b>Yahoo<\\/b>!\",\"abstract\":\"<b>Yahoo<\\/b>! home page with the latest breaking news and interesting articles, what items are trending now on the internet, links to other <b>Yahoo<\\/b>! sites and local news and ...\"},{\"date\":\"\",\"clickurl\":\"http:\\/\\/mail.yahoo.com\\/\",\"url\":\"http:\\/\\/mail.yahoo.com\\/\",\"dispurl\":\"mail.<b>yahoo<\\/b>.com\",\"title\":\"Sign in to <b>Yahoo<\\/b>\",\"abstract\":\"<b>Yahoo<\\/b> makes it easy to enjoy what matters most in your world. Best in class <b>Yahoo<\\/b> Mail, breaking local, national and global news, finance, sports, music, movies and more.\"},{\"date\":\"\",\"clickurl\":\"http:\\/\\/news.yahoo.com\\/\",\"url\":\"http:\\/\\/news.yahoo.com\\/\",\"dispurl\":\"news.<b>yahoo<\\/b>.com\",\"title\":\"<b>Yahoo<\\/b> News - Latest News &amp; Headlines\",\"abstract\":\"The latest news and headlines from <b>Yahoo<\\/b>! News. Get breaking news stories and in-depth coverage with videos and photos.\"},{\"date\":\"\",\"clickurl\":\"http:\\/\\/search.yahoo.com\\/\",\"url\":\"http:\\/\\/search.yahoo.com\\/\",\"dispurl\":\"search.<b>yahoo<\\/b>.com\",\"title\":\"<b>Yahoo<\\/b> Search - Web Search\",\"abstract\":\"Web search engine also indexing images, video, shopping sites, and local results.\"},{\"date\":\"\",\"clickurl\":\"http:\\/\\/en.wikipedia.org\\/wiki\\/Yahoo\",\"url\":\"http:\\/\\/en.wikipedia.org\\/wiki\\/Yahoo\",\"dispurl\":\"en.wikipedia.org\\/wiki\\/<b>Yahoo<\\/b>\",\"title\":\"<b>Yahoo<\\/b>! - Wikipedia, the free encyclopedia\",\"abstract\":\"<b>Yahoo<\\/b>! Inc. is an American multinational Internet corporation headquartered in Sunnyvale, California. It is globally known for its Web portal, search engine <b>Yahoo<\\/b> ...\"},{\"date\":\"\",\"clickurl\":\"http:\\/\\/sports.yahoo.com\\/\",\"url\":\"http:\\/\\/sports.yahoo.com\\/\",\"dispurl\":\"sports.<b>yahoo<\\/b>.com\",\"title\":\"<b>Yahoo<\\/b> Sports – Sports News, Scores, Rumors, Fantasy Games ...\",\"abstract\":\"All the latest sports news, scores, rumors, fantasy games, and more\"},{\"date\":\"\",\"clickurl\":\"http:\\/\\/shopping.yahoo.com\\/\",\"url\":\"http:\\/\\/shopping.yahoo.com\\/\",\"dispurl\":\"shopping.<b>yahoo<\\/b>.com\",\"title\":\"<b>Yahoo<\\/b> Shopping - Online Shopping with great products, prices ...\",\"abstract\":\"<b>Yahoo<\\/b> Shopping is the best place to read user reviews, explore great products and buy online.\"},{\"date\":\"\",\"clickurl\":\"http:\\/\\/overview.mail.yahoo.com\\/\",\"url\":\"http:\\/\\/overview.mail.yahoo.com\\/\",\"dispurl\":\"overview.mail.<b>yahoo<\\/b>.com\",\"title\":\"<b>Yahoo<\\/b> Mail | Sign-Up for free <b>Yahoo<\\/b> Mail\",\"abstract\":\"Sign up for free email available on desktop, Android, iOS and Windows 8 devices. Features include powerful spam and virus protection, attachment preview, grouped ...\"},{\"date\":\"\",\"clickurl\":\"http:\\/\\/movies.yahoo.com\\/\",\"url\":\"http:\\/\\/movies.yahoo.com\\/\",\"dispurl\":\"movies.<b>yahoo<\\/b>.com\",\"title\":\"<b>Yahoo<\\/b> Movies - Upcoming Movies, Trailers and Showtimes\",\"abstract\":\"View the latest trailers and movie reviews on <b>Yahoo<\\/b> Movies. Find everything about movies online, from upcoming releases, movie ratings, trailers and movie news\"},{\"date\":\"\",\"clickurl\":\"http:\\/\\/messenger.yahoo.com\\/\",\"url\":\"http:\\/\\/messenger.yahoo.com\\/\",\"dispurl\":\"messenger.<b>yahoo<\\/b>.com\",\"title\":\"<b>Yahoo<\\/b>! Messenger - Official Site\",\"abstract\":\"<b>Yahoo<\\/b> Messenger - Chat with friends for free and enjoy stealth settings, video calls, PC calls, file sharing, photo sharing, SMS, emoticons, &amp; more.\"},{\"date\":\"\",\"clickurl\":\"http:\\/\\/finance.yahoo.com\\/\",\"url\":\"http:\\/\\/finance.yahoo.com\\/\",\"dispurl\":\"finance.<b>yahoo<\\/b>.com\",\"title\":\"<b>Yahoo<\\/b>! Finance - Business Finance, Stock Market, Quotes, News\",\"abstract\":\"With finance news, investing info, personal finance, my portfolios, exclusives, and more.\"},{\"date\":\"\",\"clickurl\":\"http:\\/\\/weather.yahoo.com\\/\",\"url\":\"http:\\/\\/weather.yahoo.com\\/\",\"dispurl\":\"weather.<b>yahoo<\\/b>.com\",\"title\":\"<b>Yahoo<\\/b> Weather - Weather Forecasts | Maps | News\",\"abstract\":\"WeatherView the latest weather forecasts, maps, news and alerts on <b>Yahoo<\\/b>! Weather. Find local weather forecasts for the USA and cities throughout the world..\"},{\"date\":\"\",\"clickurl\":\"http:\\/\\/www.merriam-webster.com\\/dictionary\\/yahoo\",\"url\":\"http:\\/\\/www.merriam-webster.com\\/dictionary\\/yahoo\",\"dispurl\":\"www.merriam-webster.com\\/dictionary\\/<b>yahoo<\\/b>\",\"title\":\"<b>Yahoo<\\/b> - Definition and More from the Free Merriam-Webster ...\",\"abstract\":\"Full Definition of <b>YAHOO<\\/b> 1 capitalized : a member of a race of brutes in Swift's Gulliver's Travels who have the form and all the vices of humans 2 [influenced by 2 ...\"},{\"date\":\"\",\"clickurl\":\"http:\\/\\/finance.yahoo.com\\/q?s=yhoo\",\"url\":\"http:\\/\\/finance.yahoo.com\\/q?s=yhoo\",\"dispurl\":\"finance.<b>yahoo<\\/b>.com\\/q?s=yhoo\",\"title\":\"YHOO: Summary for <b>Yahoo<\\/b> Inc.- <b>Yahoo<\\/b>! Finance\",\"abstract\":\"View the basic YHOO stock chart on <b>Yahoo<\\/b>! Finance. Change the date range, chart type and compare <b>Yahoo<\\/b> Inc. against other companies.\"},{\"date\":\"\",\"clickurl\":\"http:\\/\\/games.yahoo.com\\/\",\"url\":\"http:\\/\\/games.yahoo.com\\/\",\"dispurl\":\"games.<b>yahoo<\\/b>.com\",\"title\":\"<b>Yahoo<\\/b>! Games - Play Free Online Games | Download Games\",\"abstract\":\"Play the latest online games on <b>Yahoo<\\/b>! Games. Play and download single and multiplayer games from a wide selection of arcade, board and puzzle games.\"},{\"date\":\"\",\"clickurl\":\"http:\\/\\/groups.yahoo.com\\/?m=s\",\"url\":\"http:\\/\\/groups.yahoo.com\\/?m=s\",\"dispurl\":\"groups.<b>yahoo<\\/b>.com\\/?m=s\",\"title\":\"<b>Yahoo<\\/b> Groups\",\"abstract\":\"Bonanarchy! The Mailing List for all Bonanza Fans! We have lots of pictures, past contest results and other Bonanza-related items for you to enjoy on our website.\"},{\"date\":\"\",\"clickurl\":\"http:\\/\\/my.yahoo.com\\/\",\"url\":\"http:\\/\\/my.yahoo.com\\/\",\"dispurl\":\"my.<b>yahoo<\\/b>.com\",\"title\":\"My <b>Yahoo<\\/b>\",\"abstract\":\"My <b>Yahoo<\\/b> is a customizable web page with news, stock quotes, weather, and many other features.\"},{\"date\":\"\",\"clickurl\":\"http:\\/\\/us.yahoo.com\\/?p=us\",\"url\":\"http:\\/\\/us.yahoo.com\\/?p=us\",\"dispurl\":\"us.<b>yahoo<\\/b>.com\\/?p=us\",\"title\":\"<b>Yahoo<\\/b> US\",\"abstract\":\"<b>Yahoo<\\/b>! is focused on making the world's daily habits inspiring and entertaining. By creating highly personalized experiences for our users, we keep people connected.\"},{\"date\":\"\",\"clickurl\":\"http:\\/\\/m.yahoo.com\\/\",\"url\":\"http:\\/\\/m.yahoo.com\\/\",\"dispurl\":\"m.<b>yahoo<\\/b>.com\",\"title\":\"<b>Yahoo<\\/b>! Mobile\",\"abstract\":\"Welcome to <b>Yahoo<\\/b>! Mobile. Stay up to date on the go with business, sports, and entertainment news.\"},{\"date\":\"\",\"clickurl\":\"http:\\/\\/ie.yahoo.com\\/?p=us\",\"url\":\"http:\\/\\/ie.yahoo.com\\/?p=us\",\"dispurl\":\"ie.<b>yahoo<\\/b>.com\\/?p=us\",\"title\":\"<b>Yahoo<\\/b>!\",\"abstract\":\"We would like to show you a description here but the site won’t allow us.\"},{\"date\":\"\",\"clickurl\":\"http:\\/\\/answers.yahoo.com\\/\",\"url\":\"http:\\/\\/answers.yahoo.com\\/\",\"dispurl\":\"answers.<b>yahoo<\\/b>.com\",\"title\":\"<b>Yahoo<\\/b> Answers - Home\",\"abstract\":\"<b>Yahoo<\\/b> Answers is a new way to find and share information. You can ask questions on any topic, get answers from real people, and share your insights and experience.\"},{\"date\":\"\",\"clickurl\":\"http:\\/\\/cm.uk.my.yahoo.com\\/\",\"url\":\"http:\\/\\/cm.uk.my.yahoo.com\\/\",\"dispurl\":\"cm.uk.my.<b>yahoo<\\/b>.com\",\"title\":\"My <b>Yahoo<\\/b>! - <b>Yahoo<\\/b>! UK\",\"abstract\":\"My <b>Yahoo<\\/b>! is a customisable web page from <b>Yahoo<\\/b>! UK. Personalise your page by adding news, stock quotes, weather, email, social updates and much more.\"},{\"date\":\"\",\"clickurl\":\"http:\\/\\/maps.yahoo.com\\/\",\"url\":\"http:\\/\\/maps.yahoo.com\\/\",\"dispurl\":\"maps.<b>yahoo<\\/b>.com\",\"title\":\"<b>Yahoo<\\/b> Maps, Driving Directions, and Traffic\",\"abstract\":\"<b>Yahoo<\\/b> Maps, Driving Directions, Satellite View and Traffic. Rated the best online mapping experience.\"},{\"date\":\"\",\"clickurl\":\"http:\\/\\/twitter.com\\/Yahoo\",\"url\":\"http:\\/\\/twitter.com\\/Yahoo\",\"dispurl\":\"twitter.com\\/<b>Yahoo<\\/b>\",\"title\":\"<b>Yahoo<\\/b> (<b>Yahoo<\\/b>) on Twitter\",\"abstract\":\"The latest from <b>Yahoo<\\/b> (@<b>Yahoo<\\/b>). <b>Yahoo<\\/b>'s official Twitter, sharing the best of our network. For email help: @YahooCare. Sunnyvale CA\"},{\"date\":\"\",\"clickurl\":\"http:\\/\\/music.yahoo.com\\/\",\"url\":\"http:\\/\\/music.yahoo.com\\/\",\"dispurl\":\"music.<b>yahoo<\\/b>.com\",\"title\":\"<b>Yahoo<\\/b> Music - Exclusive New Music and Music Videos\",\"abstract\":\"Find all the new music and exclusive video performances on <b>Yahoo<\\/b> Music. Get the latest news in our exclusive music blogs, listen to our online music radio and catch ...\"},{\"date\":\"\",\"clickurl\":\"http:\\/\\/fantasysports.yahoo.com\\/\",\"url\":\"http:\\/\\/fantasysports.yahoo.com\\/\",\"dispurl\":\"fantasysports.<b>yahoo<\\/b>.com\",\"title\":\"<b>Yahoo<\\/b> Fantasy Sports\",\"abstract\":\"Comprehensive Fantasy news, scores, standings, fantasy games, rumors, and more on <b>Yahoo<\\/b> Sports.\"},{\"date\":\"\",\"clickurl\":\"http:\\/\\/www.thefreedictionary.com\\/yahoo\",\"url\":\"http:\\/\\/www.thefreedictionary.com\\/yahoo\",\"dispurl\":\"www.thefreedictionary.com\\/<b>yahoo<\\/b>\",\"title\":\"<b>yahoo<\\/b> - definition of <b>yahoo<\\/b> by the Free Online Dictionary ...\",\"abstract\":\"ya·hoo (yä h, y-) n. pl. ya·hoos. A crude or brutish person. See Synonyms at boor. [From <b>Yahoo<\\/b>, member of a race of brutes in Gulliver's Travels by Jonathan Swift.]\"},{\"date\":\"\",\"clickurl\":\"http:\\/\\/ph.yahoo.com\\/?p=us\",\"url\":\"http:\\/\\/ph.yahoo.com\\/?p=us\",\"dispurl\":\"ph.<b>yahoo<\\/b>.com\\/?p=us\",\"title\":\"<b>Yahoo<\\/b>\",\"abstract\":\"We would like to show you a description here but the site won’t allow us.\"},{\"date\":\"\",\"clickurl\":\"http:\\/\\/dir.yahoo.com\\/\",\"url\":\"http:\\/\\/dir.yahoo.com\\/\",\"dispurl\":\"dir.<b>yahoo<\\/b>.com\",\"title\":\"<b>Yahoo<\\/b>! Directory\",\"abstract\":\"The first large scale directory of the Internet. Lists sites categorized by topic and location.\"},{\"date\":\"\",\"clickurl\":\"http:\\/\\/m.uk.yahoo.com\\/?p=us\",\"url\":\"http:\\/\\/m.uk.yahoo.com\\/?p=us\",\"dispurl\":\"m.uk.<b>yahoo<\\/b>.com\\/?p=us\",\"title\":\"<b>Yahoo<\\/b> .co.uk\",\"abstract\":\"We would like to show you a description here but the site won’t allow us.\"},{\"date\":\"\",\"clickurl\":\"http:\\/\\/messenger.yahoo.com\\/download\\/\",\"url\":\"http:\\/\\/messenger.yahoo.com\\/download\\/\",\"dispurl\":\"messenger.<b>yahoo<\\/b>.com\\/download\",\"title\":\"Download - <b>Yahoo<\\/b> Messenger 11.5\",\"abstract\":\"Download <b>Yahoo<\\/b> Messenger for free to chat with friends, make PC calls, SMS, share files, share photos, listen to streaming radio and more.\"},{\"date\":\"\",\"clickurl\":\"http:\\/\\/biz.yahoo.com\\/\",\"url\":\"http:\\/\\/biz.yahoo.com\\/\",\"dispurl\":\"biz.<b>yahoo<\\/b>.com\",\"title\":\"Top News Archive - <b>Yahoo<\\/b>! Finance\",\"abstract\":\"Top News Archive - <b>Yahoo<\\/b>! Finance - Use <b>Yahoo<\\/b>! Finance to find breaking news headlines and articles on companies, the economy, markets, investing ideas, personal ...\"},{\"date\":\"\",\"clickurl\":\"http:\\/\\/omg.yahoo.com\\/news\\/\",\"url\":\"http:\\/\\/omg.yahoo.com\\/news\\/\",\"dispurl\":\"omg.<b>yahoo<\\/b>.com\\/news\",\"title\":\"Celebrity News | Celebrity Gossip - <b>Yahoo<\\/b>! omg!\",\"abstract\":\"Get the latest celebrity news from <b>Yahoo<\\/b>! omg! Find the latest news about the Hollywood celebrities with videos and photos\"},{\"date\":\"\",\"clickurl\":\"http:\\/\\/tv.yahoo.com\\/\",\"url\":\"http:\\/\\/tv.yahoo.com\\/\",\"dispurl\":\"tv.<b>yahoo<\\/b>.com\",\"title\":\"<b>Yahoo<\\/b> TV\",\"abstract\":\"<b>Yahoo<\\/b> TV is your guide to everything about TV online, from TV show listings and episode guides, to the latest TV show photos, clips, news, recaps, cast &amp; credits ...\"},{\"date\":\"\",\"clickurl\":\"http:\\/\\/dictionary.reference.com\\/browse\\/yahoo\",\"url\":\"http:\\/\\/dictionary.reference.com\\/browse\\/yahoo\",\"dispurl\":\"dictionary.reference.com\\/browse\\/<b>yahoo<\\/b>\",\"title\":\"<b>Yahoo<\\/b> - Dictionary.com - Free Online English Dictionary\",\"abstract\":\"<b>Yahoo<\\/b> definition World-Wide Web Yet Another Hierarchical Officious\\/Obstreperous\\/Odiferous\\/Organized Oracle. (Or a member of a race of brutes in Swift's Gulliver's ...\"},{\"date\":\"\",\"clickurl\":\"http:\\/\\/info.yahoo.com\\/\",\"url\":\"http:\\/\\/info.yahoo.com\\/\",\"dispurl\":\"info.<b>yahoo<\\/b>.com\",\"title\":\"Corporate Information - <b>Yahoo<\\/b>\",\"abstract\":\"Policies and terms for users, as well as information for investors,for prospective employees, and in the company in general.\"},{\"date\":\"\",\"clickurl\":\"http:\\/\\/us.m.yahoo.com\\/\",\"url\":\"http:\\/\\/us.m.yahoo.com\\/\",\"dispurl\":\"us.m.<b>yahoo<\\/b>.com\",\"title\":\"<b>Yahoo<\\/b>! Mobile\",\"abstract\":\"At your <b>Yahoo<\\/b>! mobile site you can access email, favorites, all other sites, read news articles, weather, whats trending now, entertainment and sports.\"},{\"date\":\"\",\"clickurl\":\"http:\\/\\/biz.yahoo.com\\/r\\/\",\"url\":\"http:\\/\\/biz.yahoo.com\\/r\\/\",\"dispurl\":\"biz.<b>yahoo<\\/b>.com\\/r\",\"title\":\"Stock Research Center - <b>Yahoo<\\/b> Finance - Company Reports ...\",\"abstract\":\"Research Center - Learn about companies through earnings announcements, analyst research reports, and company reports. Use research tools like screeners, financial ...\"},{\"date\":\"\",\"clickurl\":\"http:\\/\\/www.ysearchblog.com\\/\",\"url\":\"http:\\/\\/www.ysearchblog.com\\/\",\"dispurl\":\"www.ysearchblog.com\",\"title\":\"<b>Yahoo<\\/b>! Search Blog\",\"abstract\":\"We’ve moved! As of today, the <b>Yahoo<\\/b>! Search blog has moved to yahoosearch.tumblr.com. Come on over and check out the new digs!\"},{\"date\":\"\",\"clickurl\":\"http:\\/\\/new.m.yahoo.com\\/\",\"url\":\"http:\\/\\/new.m.yahoo.com\\/\",\"dispurl\":\"new.m.<b>yahoo<\\/b>.com\",\"title\":\"<b>Yahoo<\\/b>!\",\"abstract\":\"Laughingstock has NFL's best coach opening One team that just fired its head coach could contend for a Super Bowl next season.\"},{\"date\":\"\",\"clickurl\":\"http:\\/\\/wap.yahoo.com\\/\",\"url\":\"http:\\/\\/wap.yahoo.com\\/\",\"dispurl\":\"wap.<b>yahoo<\\/b>.com\",\"title\":\"<b>Yahoo<\\/b>!\",\"abstract\":\"<b>Yahoo<\\/b> wap site. Click to see todays news.\"},{\"date\":\"\",\"clickurl\":\"http:\\/\\/local.yahoo.com\\/\",\"url\":\"http:\\/\\/local.yahoo.com\\/\",\"dispurl\":\"local.<b>yahoo<\\/b>.com\",\"title\":\"San Francisco City Pages on <b>Yahoo<\\/b> Local. Find Businesses ...\",\"abstract\":\"<b>Yahoo<\\/b> Local has San Francisco business reviews, top rated services, and events near San Francisco, CA. Use interactive maps, driving directions reviews and ratings to ...\"},{\"date\":\"\",\"clickurl\":\"http:\\/\\/mlogin.yahoo.com\\/\",\"url\":\"http:\\/\\/mlogin.yahoo.com\\/\",\"dispurl\":\"mlogin.<b>yahoo<\\/b>.com\",\"title\":\"Login - <b>Yahoo<\\/b> !\",\"abstract\":\"Visit www.<b>yahoo<\\/b>.com with your computer and sign up for free.\"},{\"date\":\"\",\"clickurl\":\"http:\\/\\/games.yahoo.com\\/blogs\\/\",\"url\":\"http:\\/\\/games.yahoo.com\\/blogs\\/\",\"dispurl\":\"games.<b>yahoo<\\/b>.com\\/blogs\",\"title\":\"News and Features - <b>Yahoo<\\/b> Games\",\"abstract\":\"Find the latest blog posts from our game bloggers on <b>Yahoo<\\/b> Games. Read posts on the latest game releases, game reviews and the latest news.\"},{\"date\":\"\",\"clickurl\":\"http:\\/\\/careers.yahoo.com\\/\",\"url\":\"http:\\/\\/careers.yahoo.com\\/\",\"dispurl\":\"careers.<b>yahoo<\\/b>.com\",\"title\":\"<b>Yahoo<\\/b>! Careers\",\"abstract\":\"We would like to show you a description here but the site won’t allow us.\"},{\"date\":\"\",\"clickurl\":\"http:\\/\\/developer.yahoo.com\\/\",\"url\":\"http:\\/\\/developer.yahoo.com\\/\",\"dispurl\":\"developer.<b>yahoo<\\/b>.com\",\"title\":\"<b>Yahoo<\\/b>! Developer Network\",\"abstract\":\"The <b>Yahoo<\\/b>! Developer Network offers Web Services and APIs to make it easy for developers to build applications and mashups\"},{\"date\":\"\",\"clickurl\":\"http:\\/\\/everything.yahoo.com\\/\",\"url\":\"http:\\/\\/everything.yahoo.com\\/\",\"dispurl\":\"everything.<b>yahoo<\\/b>.com\",\"title\":\"<b>Yahoo<\\/b>!\",\"abstract\":\"Subject link list of everything <b>Yahoo<\\/b>!\"},{\"date\":\"\",\"clickurl\":\"http:\\/\\/toolbar.yahoo.com\\/\",\"url\":\"http:\\/\\/toolbar.yahoo.com\\/\",\"dispurl\":\"toolbar.<b>yahoo<\\/b>.com\",\"title\":\"<b>Yahoo<\\/b> Toolbar - Stay in touch with your world.\",\"abstract\":\"<b>Yahoo<\\/b> Toolbar is currently unavailable on this browser. Get Answers, Not Links Organize Your Web Connect and Share All-Inclusive Communication Rain or Shine?\"},{\"date\":\"\",\"clickurl\":\"http:\\/\\/my.messenger.yahoo.com\\/\",\"url\":\"http:\\/\\/my.messenger.yahoo.com\\/\",\"dispurl\":\"my.messenger.<b>yahoo<\\/b>.com\",\"title\":\"<b>Yahoo<\\/b> Messenger - Chat, Instant message, SMS, Video Call, PC ...\",\"abstract\":\"<b>Yahoo<\\/b> Messenger - Chat with friends for free and enjoy stealth settings, video calls, PC calls, file sharing, photo sharing, SMS, emoticons, &amp; more.\"},{\"date\":\"\",\"clickurl\":\"http:\\/\\/us.yhs.search.yahoo.com\\/\",\"url\":\"http:\\/\\/us.yhs.search.yahoo.com\\/\",\"dispurl\":\"us.yhs.search.<b>yahoo<\\/b>.com\",\"title\":\"<b>Yahoo<\\/b> Search - Web Search\",\"abstract\":\"The search engine that helps you find exactly what you're looking for. Find the most relevant information, video, images, and answers from all across the Web.\"}]}}}";
        final YahooResultParser parser = new YahooResultParser();
        final SearchResults searchResults = parser.parseWeb("Brian Du Preez", results);
        System.out.println(searchResults);
    }
}
