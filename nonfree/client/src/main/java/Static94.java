import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!dga", name = "c", descriptor = "B")
	public static byte aByte24;

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "Ljava/util/Hashtable;")
	public static final Hashtable aHashtable3 = new Hashtable();

	@OriginalMember(owner = "client!dga", name = "d", descriptor = "Z")
	public static boolean aBoolean171 = false;

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(JB)V")
	public static void method1990(@OriginalArg(0) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(11) InterruptedException local11) {
		}
	}
}
