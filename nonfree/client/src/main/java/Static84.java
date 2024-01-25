import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!eq", name = "d", descriptor = "Lclient!tg;")
	public static Class191 aClass191_2;

	@OriginalMember(owner = "client!eq", name = "l", descriptor = "[[B")
	public static byte[][] aByteArrayArray4;

	@OriginalMember(owner = "client!eq", name = "q", descriptor = "I")
	public static int anInt1566;

	@OriginalMember(owner = "client!eq", name = "p", descriptor = "Lclient!wl;")
	public static final Class221 aClass221_67 = new Class221(69, 8);

	@OriginalMember(owner = "client!eq", name = "r", descriptor = "I")
	public static int anInt1567 = -1;

	@OriginalMember(owner = "client!eq", name = "w", descriptor = "I")
	public static final int anInt1572 = 52;

	@OriginalMember(owner = "client!eq", name = "x", descriptor = "Lclient!jg;")
	public static Class107 aClass107_9 = new Class107(64);

	@OriginalMember(owner = "client!eq", name = "y", descriptor = "I")
	public static int anInt1573 = -1;

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(ILclient!sc;)V")
	public static void method1689(@OriginalArg(1) Class179 arg0) {
		Static333.anInt6458 = 3;
		Static243.method4364(true);
		Static360.anInt6856 = 1;
		Static309.aBoolean544 = true;
		Static207.anInt4534 = 0;
		Static17.anInt277 = 127;
		Static146.aBoolean287 = true;
		Static46.anInt752 = 127;
		Static39.aBoolean48 = true;
		Static218.anInt4842 = 0;
		Static134.aBoolean271 = true;
		Static273.aBoolean494 = true;
		Static222.anInt6836 = 2;
		Static219.aBoolean425 = true;
		Static145.aBoolean285 = true;
		Static128.anInt2762 = 0;
		Static241.anInt5136 = 255;
		Static245.aBoolean453 = true;
		Static346.aBoolean526 = true;
		Static205.aBoolean391 = true;
		Static181.anInt4031 = 0;
		if (Static147.anInt3175 < 96) {
			Static24.method873(0);
		} else {
			Static24.method873(2);
		}
		Static353.aBoolean525 = false;
		Static168.anInt3821 = Static190.anInt6229 == 1 ? 2 : 4;
		Static311.aBoolean549 = false;
		Static243.aBoolean451 = true;
		Static18.anInt304 = 2;
		Static313.anInt6146 = 2;
		Static352.anInt6763 = 0;
		Static248.anInt5206 = 0;
		Static363.aBoolean618 = false;
		Static204.aBoolean384 = true;
		@Pc(90) Class209 local90 = null;
		try {
			@Pc(99) Class26 local99 = arg0.method4885();
			while (local99.anInt484 == 0) {
				Static248.method4401(1L);
			}
			if (local99.anInt484 == 1) {
				local90 = (Class209) local99.anObject1;
				@Pc(123) byte[] local123 = new byte[(int) local90.method5629()];
				@Pc(138) int local138;
				for (@Pc(125) int local125 = 0; local125 < local123.length; local125 += local138) {
					local138 = local90.method5627(local123, local125, local123.length - local125);
					if (local138 == -1) {
						throw new IOException("EOF");
					}
				}
				Static106.method2088(new Class2_Sub12(local123));
			}
		} catch (@Pc(167) Exception local167) {
		}
		try {
			if (local90 != null) {
				local90.method5628();
			}
		} catch (@Pc(174) Exception local174) {
		}
	}

	@OriginalMember(owner = "client!eq", name = "b", descriptor = "(I)V")
	public static void method1691() {
		for (@Pc(10) Class2_Sub37 local10 = (Class2_Sub37) Static309.aClass180_41.method4919(); local10 != null; local10 = (Class2_Sub37) Static309.aClass180_41.method4916()) {
			if (local10.aBoolean510) {
				local10.method4838();
			}
		}
		for (@Pc(34) Class2_Sub37 local34 = (Class2_Sub37) Static120.aClass180_2.method4919(); local34 != null; local34 = (Class2_Sub37) Static120.aClass180_2.method4916()) {
			if (local34.aBoolean510) {
				local34.method4838();
			}
		}
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIIIZ)V")
	public static void method1692(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3) {
		Static91.aLong62 = 0L;
		@Pc(14) int local14 = Static26.method3361();
		if (arg1 == 3 || local14 == 3) {
			arg3 = true;
		}
		if (!Static51.aClass37_1.method3713()) {
			arg3 = true;
		}
		Static345.method5622(arg1, arg3, arg0, local14, arg2);
	}
}
