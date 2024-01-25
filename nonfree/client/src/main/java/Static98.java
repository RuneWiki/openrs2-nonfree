import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!dk", name = "b", descriptor = "I")
	public static int anInt2413;

	@OriginalMember(owner = "client!dk", name = "d", descriptor = "Lclient!kca;")
	public static Class171 aClass171_1;

	@OriginalMember(owner = "client!dk", name = "h", descriptor = "Lclient!td;")
	public static Class313 aClass313_1;

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "Lclient!rl;")
	public static final Class287 aClass287_38 = new Class287(44, 11);

	@OriginalMember(owner = "client!dk", name = "c", descriptor = "Z")
	public static boolean aBoolean176 = true;

	@OriginalMember(owner = "client!dk", name = "g", descriptor = "[Lclient!jw;")
	public static final Class167[] aClass167Array1 = new Class167[8];

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(ILclient!pca;)V")
	public static void method2037(@OriginalArg(1) Class251 arg0) {
		if (Static205.anInt4382 != arg0.anInt7249) {
			return;
		}
		if (Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.aString183 == null) {
			arg0.anInt7219 = 0;
			arg0.anInt7229 = 0;
			return;
		}
		arg0.anInt7252 = 150;
		arg0.anInt7269 = (int) (Math.sin((double) Static397.anInt6998 / 40.0D) * 256.0D) & 0x7FF;
		arg0.anInt7229 = Static147.anInt3433;
		arg0.anInt7288 = 5;
		arg0.anInt7219 = Static454.method6255(Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.aString183);
		arg0.anInt7270 = Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.lb;
		arg0.anInt7266 = Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.anInt8516;
		arg0.anInt7222 = 0;
		arg0.anInt7271 = Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.anInt8517;
		@Pc(73) Class270 local73 = arg0.anInt7266 == -1 ? null : Static245.aClass155_1.method3820(arg0.anInt7266);
		if (local73 != null) {
			Static372.method5237(arg0.anInt7271, local73);
		}
	}
}
