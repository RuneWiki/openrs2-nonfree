import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!rc", name = "d", descriptor = "I")
	public static int anInt592 = 0;

	@OriginalMember(owner = "client!rc", name = "e", descriptor = "[I")
	public static int[] anIntArray75 = new int[128];

	@OriginalMember(owner = "client!rc", name = "o", descriptor = "[I")
	public static int[] anIntArray76 = new int[25];

	@OriginalMember(owner = "client!rc", name = "v", descriptor = "Lclient!od;")
	public static Class60 aClass60_186 = Static41.method597("sind fehlgeschlagen)3 Bitte warten Sie 5 Minuten)1");

	@OriginalMember(owner = "client!rc", name = "w", descriptor = "[[B")
	public static byte[][] aByteArrayArray3 = new byte[250][];

	@OriginalMember(owner = "client!rc", name = "A", descriptor = "I")
	public static int anInt611 = -1;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIIBLclient!t;Z)V")
	public static void method340(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte arg3, @OriginalArg(5) Class10_Sub1 arg4, @OriginalArg(6) boolean arg5) {
		@Pc(10) long local10 = (long) (arg2 + (arg0 << 16));
		@Pc(16) Class4_Sub3_Sub9 local16 = (Class4_Sub3_Sub9) Static41.aClass75_6.method1896(local10);
		if (local16 != null) {
			return;
		}
		local16 = (Class4_Sub3_Sub9) Static132.aClass75_15.method1896(local10);
		if (local16 != null) {
			return;
		}
		local16 = (Class4_Sub3_Sub9) Static97.aClass75_13.method1896(local10);
		if (local16 == null) {
			if (!arg5) {
				local16 = (Class4_Sub3_Sub9) Static26.aClass75_5.method1896(local10);
				if (local16 != null) {
					return;
				}
			}
			local16 = new Class4_Sub3_Sub9();
			local16.anInt1741 = arg1;
			local16.aClass10_Sub1_13 = arg4;
			local16.aByte6 = arg3;
			if (arg5) {
				Static41.aClass75_6.method1892(local10, local16);
				Static91.anInt2146++;
			} else {
				Static56.aClass59_2.method1290(local16);
				Static97.aClass75_13.method1892(local10, local16);
				Static32.anInt942++;
			}
		} else if (arg5) {
			local16.method1996();
			Static41.aClass75_6.method1892(local10, local16);
			Static91.anInt2146++;
			Static32.anInt942--;
		}
	}

	@OriginalMember(owner = "client!rc", name = "g", descriptor = "(I)V")
	public static void method346() {
		aClass60_186 = null;
		anIntArray75 = null;
		aByteArrayArray3 = null;
		anIntArray76 = null;
	}
}
