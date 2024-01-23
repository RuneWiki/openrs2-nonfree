import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!gm", name = "s", descriptor = "Lclient!un;")
	public static Class1_Sub8_Sub4 aClass1_Sub8_Sub4_2;

	@OriginalMember(owner = "client!gm", name = "w", descriptor = "I")
	public static int anInt1769;

	@OriginalMember(owner = "client!gm", name = "B", descriptor = "I")
	public static int anInt1772;

	@OriginalMember(owner = "client!gm", name = "r", descriptor = "Ljava/util/zip/CRC32;")
	public static CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!gm", name = "t", descriptor = "Lclient!cm;")
	public static Class1_Sub4 aClass1_Sub4_1 = new Class1_Sub4(0, 0);

	@OriginalMember(owner = "client!gm", name = "v", descriptor = "[I")
	public static int[] anIntArray236 = new int[14];

	@OriginalMember(owner = "client!gm", name = "x", descriptor = "[I")
	public static int[] anIntArray237 = new int[50];

	@OriginalMember(owner = "client!gm", name = "y", descriptor = "[I")
	public static int[] anIntArray238 = new int[64];

	@OriginalMember(owner = "client!gm", name = "z", descriptor = "I")
	public static int anInt1770 = -1;

	@OriginalMember(owner = "client!gm", name = "A", descriptor = "I")
	public static int anInt1771 = 128;

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method1531(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		@Pc(12) Class1_Sub2_Sub11 local12 = Static163.method3579(2, arg0);
		local12.method1859();
		local12.aString70 = arg1;
	}
}
