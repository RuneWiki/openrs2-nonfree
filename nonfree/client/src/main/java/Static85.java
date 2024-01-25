import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "Lclient!kq;")
	public static Class152 aClass152_2;

	@OriginalMember(owner = "client!eb", name = "i", descriptor = "[F")
	public static final float[] aFloatArray6 = new float[4];

	@OriginalMember(owner = "client!eb", name = "t", descriptor = "Lclient!ud;")
	public static final Class245 aClass245_7 = new Class245(12, 0, 1, 0);

	@OriginalMember(owner = "client!eb", name = "u", descriptor = "Lclient!dq;")
	public static final Class56 aClass56_64 = new Class56(106, 6);

	@OriginalMember(owner = "client!eb", name = "v", descriptor = "Lclient!ap;")
	public static final Class15 aClass15_29 = new Class15("Your ignore list is full, max of 100.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O máx. é 100.");

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)V")
	public static void method1324() {
		Static82.aBoolean108 = true;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lclient!vh;IIIII)V")
	public static void method1328(@OriginalArg(0) Class184 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt4551 = 0;
		for (@Pc(4) int local4 = 0; local4 < 4; local4++) {
			if (arg0.aClass4_Sub7Array2[local4] != null) {
				arg0.anInt4551++;
			}
		}
		label51: for (@Pc(22) int local22 = 0; local22 < arg0.anInt4551; local22++) {
			@Pc(31) long local31 = Static81.aLongArrayArrayArray1[arg1][arg2][arg3];
			@Pc(41) Class154 local41;
			while (local31 != 0L) {
				local41 = Static367.aClass154Array1[(int) ((local31 & 0xFFFFL) - 1L)];
				local31 >>>= 0x10;
				if (local41.aClass4_Sub7_1 == arg0.aClass4_Sub7Array2[local22]) {
					continue label51;
				}
			}
			local31 = Static81.aLongArrayArrayArray1[arg1][arg4][arg5];
			while (local31 != 0L) {
				local41 = Static367.aClass154Array1[(int) ((local31 & 0xFFFFL) - 1L)];
				local31 >>>= 0x10;
				if (local41.aClass4_Sub7_1 == arg0.aClass4_Sub7Array2[local22]) {
					continue label51;
				}
			}
			for (@Pc(93) int local93 = local22; local93 < arg0.anInt4551 - 1; local93++) {
				arg0.aClass4_Sub7Array2[local93] = arg0.aClass4_Sub7Array2[local93 + 1];
			}
			arg0.anInt4551--;
		}
	}
}
