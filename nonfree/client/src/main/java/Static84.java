import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!eb", name = "U", descriptor = "I")
	public static int anInt958;

	@OriginalMember(owner = "client!eb", name = "K", descriptor = "Lclient!ho;")
	public static final Class103 aClass103_47 = new Class103(21, 8);

	@OriginalMember(owner = "client!eb", name = "O", descriptor = "[I")
	public static final int[] anIntArray47 = new int[] { 28, 35, 40, 44 };

	@OriginalMember(owner = "client!eb", name = "V", descriptor = "I")
	public static int anInt959 = -1;

	@OriginalMember(owner = "client!eb", name = "W", descriptor = "Lclient!ho;")
	public static final Class103 aClass103_48 = new Class103(43, 3);

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(ZBJLjava/lang/String;)V")
	public static void method911(@OriginalArg(0) boolean arg0, @OriginalArg(2) long arg1, @OriginalArg(3) String arg2) {
		if (arg0) {
			Static369.method4899();
			if (Static146.aString34.equals("")) {
				Static411.anInt6757 = 39;
				return;
			}
		}
		@Pc(19) Class1_Sub28 local19 = new Class1_Sub28(128);
		local19.method5398(10);
		local19.method5393((int) (Math.random() * 65535.0D));
		local19.method5371(arg1);
		local19.method5393(Static83.anInt1575);
		local19.method5347((int) (Math.random() * 9.9999999E7D));
		local19.method5364(arg2);
		local19.method5347((int) (Math.random() * 9.9999999E7D));
		if (arg0) {
			local19.method5371(Static415.method5404(Static146.aString34));
			try {
				local19.method5371(Long.parseLong(Static279.aString59));
			} catch (@Pc(111) Exception local111) {
				Static411.anInt6757 = 39;
				return;
			}
		} else {
			local19.method5347((int) (Math.random() * 9.9999999E7D));
			local19.method5347((int) (Math.random() * 9.9999999E7D));
			local19.method5347((int) (Math.random() * 9.9999999E7D));
			local19.method5347((int) (Math.random() * 9.9999999E7D));
		}
		local19.method5347((int) (Math.random() * 9.9999999E7D));
		local19.method5373(Static125.aBigInteger1, Static139.aBigInteger2);
		Static18.aClass1_Sub28_Sub1_1.anInt6812 = 0;
		Static18.aClass1_Sub28_Sub1_1.method5398(arg0 ? Static180.aClass99_12.anInt2588 : Static180.aClass99_9.anInt2588);
		Static18.aClass1_Sub28_Sub1_1.method5393(local19.anInt6812 + 28);
		Static18.aClass1_Sub28_Sub1_1.method5393(596);
		Static18.aClass1_Sub28_Sub1_1.method5398(Static394.anInt6582);
		Static18.aClass1_Sub28_Sub1_1.method5398(Static183.aClass48_3.anInt1229);
		Static368.method4890(Static18.aClass1_Sub28_Sub1_1);
		Static18.aClass1_Sub28_Sub1_1.method5387(local19.aByteArray86, local19.anInt6812);
		Static408.anInt6718 = 1;
		Static411.anInt6757 = -3;
		Static324.anInt5564 = 0;
		Static437.anInt7330 = 0;
	}

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "(III)V")
	public static void method913(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class169 local7 = Static359.aClass169ArrayArrayArray5[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		if (local7.aClass25_Sub4_2 != null) {
			local7.aClass25_Sub4_2 = null;
		}
		if (local7.aClass25_Sub4_1 != null) {
			local7.aClass25_Sub4_1 = null;
		}
	}
}
