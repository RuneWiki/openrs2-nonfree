import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static95 {

	@OriginalMember(owner = "client!db", name = "n", descriptor = "J")
	public static long aLong44;

	@OriginalMember(owner = "client!db", name = "u", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray9 = new String[200];

	@OriginalMember(owner = "client!db", name = "v", descriptor = "Lclient!up;")
	public static final Class357 aClass357_1 = new Class357();

	@OriginalMember(owner = "client!db", name = "q", descriptor = "I")
	public static final int anInt1559 = 1407;

	@OriginalMember(owner = "client!db", name = "y", descriptor = "S")
	public static short aShort14 = 205;

	@OriginalMember(owner = "client!db", name = "o", descriptor = "Z")
	public static boolean aBoolean147 = false;

	@OriginalMember(owner = "client!db", name = "s", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray10 = new String[100];

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IZLjava/net/Socket;)Lclient!vt;")
	public static Class295 method1405(@OriginalArg(2) Socket arg0) throws IOException {
		return new Class295_Sub1(arg0, 15000);
	}
}
