import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!ee", name = "f", descriptor = "I")
	public static int anInt1583;

	@OriginalMember(owner = "client!ee", name = "l", descriptor = "I")
	public static int anInt1588 = 0;

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIIIZZ)V")
	public static void method1537(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) boolean arg3, @OriginalArg(6) boolean arg4) {
		Static437.anInt7308 = 7;
		Static99.anInt1803 = 0x1 << Static437.anInt7308;
		Static22.anInt382 = Static99.anInt1803 >> 1;
		Static84.anInt6076 = (int) Math.sqrt((double) (Static22.anInt382 * Static22.anInt382 + Static22.anInt382 * Static22.anInt382));
		Static391.anInt6550 = Static99.anInt1803 >> 2;
		Static38.anInt635 = Static99.anInt1803;
		Static459.anInt5916 = arg0;
		Static342.anInt5746 = arg1;
		Static24.anInt2908 = arg2;
		Static257.aClass227ArrayArrayArray4 = new Class227[4][Static459.anInt5916][Static342.anInt5746];
		Static182.aClass55Array2 = new Class55[4];
		if (arg3) {
			Static328.anIntArrayArray46 = new int[Static459.anInt5916][Static342.anInt5746];
			Static422.aByteArrayArray23 = new byte[Static459.anInt5916][Static342.anInt5746];
			Static404.aShortArrayArray6 = new short[Static459.anInt5916][Static342.anInt5746];
			Static137.aClass227ArrayArrayArray1 = new Class227[1][Static459.anInt5916][Static342.anInt5746];
			Static349.aClass55Array3 = new Class55[1];
		} else {
			Static328.anIntArrayArray46 = null;
			Static422.aByteArrayArray23 = null;
			Static404.aShortArrayArray6 = null;
			Static137.aClass227ArrayArrayArray1 = null;
			Static349.aClass55Array3 = null;
		}
		if (arg4) {
			Static60.aLongArrayArrayArray1 = new long[4][arg0][arg1];
			Static197.aClass226Array1 = new Class226[65535];
			Static66.aBooleanArray6 = new boolean[65535];
			Static329.anInt5518 = 0;
		} else {
			Static60.aLongArrayArrayArray1 = null;
			Static197.aClass226Array1 = null;
			Static66.aBooleanArray6 = null;
			Static329.anInt5518 = 0;
		}
		Static234.method3420(false);
		Static178.aClass103Array1 = new Class103[1000];
		Static339.anInt5688 = 0;
		Static368.aClass103Array2 = new Class103[1000];
		Static234.anInt4001 = 0;
		Static28.anIntArrayArrayArray1 = new int[4][Static459.anInt5916 + 1][Static342.anInt5746 + 1];
		Static424.aClass1_Sub2Array3 = new Class1_Sub2[5000];
		Static17.anInt290 = 0;
		Static39.aBooleanArrayArray1 = new boolean[Static24.anInt2908 + Static24.anInt2908 + 1][Static24.anInt2908 + Static24.anInt2908 + 1];
		Static111.aBooleanArrayArray4 = new boolean[Static24.anInt2908 + Static24.anInt2908 + 2][Static24.anInt2908 + Static24.anInt2908 + 2];
		Static316.aClass12_1 = null;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lclient!cf;ZZI)V")
	public static void method1538(@OriginalArg(0) Class3_Sub10 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		@Pc(8) int local8 = arg0.anInt827;
		@Pc(12) int local12 = (int) arg0.aLong248;
		arg0.method6288();
		if (arg2) {
			Static292.method4190(local8);
		}
		Static110.method1805(local8);
		@Pc(27) Class82 local27 = Static180.method2857(local12);
		if (local27 != null) {
			Static463.method6297(local27);
		}
		Static128.method2019();
		if (!arg1 && Static343.anInt5785 != -1) {
			Static407.method5564(Static343.anInt5785, 1);
		}
		@Pc(51) Class254 local51 = new Class254(Static32.aClass140_5);
		for (@Pc(56) Class3_Sub10 local56 = (Class3_Sub10) local51.method5859(); local56 != null; local56 = (Class3_Sub10) local51.method5863()) {
			if (!local56.method6287()) {
				local56 = (Class3_Sub10) local51.method5859();
				if (local56 == null) {
					return;
				}
			}
			if (local56.anInt831 == 3) {
				@Pc(80) int local80 = (int) local56.aLong248;
				if (local80 >>> 16 == local8) {
					method1538(local56, arg1, true);
				}
			}
		}
	}
}
