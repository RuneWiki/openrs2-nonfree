import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(Lclient!in;I)V")
	public static void method1452(@OriginalArg(0) Class160 arg0) {
		if (Static330.anInt6028 != arg0.anInt4186) {
			return;
		}
		if (Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.aString35 == null) {
			arg0.anInt4189 = 0;
			arg0.anInt4197 = 0;
			return;
		}
		arg0.anInt4179 = 150;
		arg0.anInt4214 = (int) (Math.sin((double) Static518.anInt9331 / 40.0D) * 256.0D) & 0x7FF;
		arg0.anInt4189 = Static310.anInt5693;
		arg0.anInt4172 = 5;
		arg0.anInt4197 = Static515.method7170(Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.aString35);
		arg0.anInt4143 = Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.anInt7577;
		arg0.anInt4148 = Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.anInt7593;
		arg0.anInt4154 = Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.anInt7525;
		arg0.anInt4222 = 0;
		@Pc(75) Class197 local75 = arg0.anInt4143 == -1 ? null : Static223.aClass245_1.method5312(arg0.anInt4143);
		if (local75 != null) {
			Static392.method5630(local75, arg0.anInt4148);
		}
	}
}
