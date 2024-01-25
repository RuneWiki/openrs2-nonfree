import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!dc", name = "j", descriptor = "[I")
	public static int[] anIntArray134;

	@OriginalMember(owner = "client!dc", name = "o", descriptor = "Lclient!kj;")
	public static final Class187 aClass187_4 = new Class187(8, 7);

	@OriginalMember(owner = "client!dc", name = "t", descriptor = "Lclient!qfa;")
	public static final Class272 aClass272_52 = new Class272(8, 3);

	@OriginalMember(owner = "client!dc", name = "v", descriptor = "Lclient!kj;")
	public static final Class187 aClass187_5 = new Class187(5, 19);

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Ljava/io/File;IB)[B")
	public static byte[] method1823(@OriginalArg(0) File arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(6) byte[] local6 = new byte[arg1];
			Static465.method6455(local6, arg1, arg0);
			return local6;
		} catch (@Pc(19) IOException local19) {
			return null;
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(ZILjava/lang/String;)V")
	public static void method1824(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		@Pc(13) Class3_Sub3_Sub7 local13 = Static363.method5457(arg0, 2);
		local13.method839();
		local13.aString24 = arg1;
	}
}
