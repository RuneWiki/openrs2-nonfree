import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!df", name = "c", descriptor = "(I)V")
	public static void method2090() {
		Static256.aBoolean379 = true;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Lclient!bd;IIILclient!st;Lclient!hfa;II)V")
	public static void method2092(@OriginalArg(0) Class25 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class10_Sub1_Sub2_Sub2 arg3, @OriginalArg(5) Class10_Sub1_Sub2_Sub1 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) Class4_Sub51 local7 = new Class4_Sub51();
		local7.anInt9606 = arg5 << 9;
		local7.anInt9601 = arg6 << 9;
		local7.anInt9594 = arg1;
		if (arg0 != null) {
			local7.aClass25_1 = arg0;
			@Pc(146) int local146 = arg0.anInt612;
			@Pc(149) int local149 = arg0.anInt638;
			if (arg2 == 1 || arg2 == 3) {
				local146 = arg0.anInt638;
				local149 = arg0.anInt612;
			}
			local7.anInt9604 = arg0.anInt627 << 9;
			local7.anInt9596 = arg0.anInt639;
			local7.aBoolean676 = arg0.aBoolean60;
			local7.anInt9603 = arg0.anInt625;
			local7.aBoolean677 = arg0.aBoolean50;
			local7.anInt9598 = arg0.anInt624;
			local7.anInt9600 = arg0.anInt623;
			local7.anInt9597 = arg6 + local146 << 9;
			local7.anInt9605 = arg5 + local149 << 9;
			local7.anIntArray710 = arg0.anIntArray116;
			if (arg0.anIntArray115 != null) {
				local7.aBoolean678 = true;
				local7.method7876();
			}
			if (local7.anIntArray710 != null) {
				local7.anInt9599 = (int) ((double) (local7.anInt9596 - local7.anInt9600) * Math.random()) + local7.anInt9600;
			}
			Static217.aClass124_22.method3275(local7);
			return;
		}
		if (arg4 != null) {
			local7.aClass10_Sub1_Sub2_Sub1_2 = arg4;
			@Pc(34) Class54 local34 = arg4.aClass54_1;
			if (local34.anIntArray150 != null) {
				local7.aBoolean678 = true;
				local34 = local34.method1118(Static511.aClass335_2);
			}
			if (local34 != null) {
				local7.anInt9605 = local34.anInt1260 + arg5 << 9;
				local7.anInt9597 = local34.anInt1260 + arg6 << 9;
				local7.anInt9598 = Static145.method2998(arg4);
				local7.anInt9604 = local34.anInt1293 << 9;
				local7.aBoolean676 = local34.aBoolean96;
				local7.anInt9603 = local34.anInt1259;
			}
			Static162.aClass124_19.method3275(local7);
			return;
		}
		if (arg3 == null) {
			return;
		}
		local7.aClass10_Sub1_Sub2_Sub2_2 = arg3;
		local7.anInt9597 = arg6 + arg3.method7021() << 9;
		local7.anInt9605 = arg5 + arg3.method7021() << 9;
		local7.anInt9598 = Static385.method5690(arg3);
		local7.aBoolean676 = arg3.aBoolean595;
		local7.anInt9603 = arg3.anInt8541;
		local7.anInt9604 = arg3.anInt8562 << 9;
		Static518.aClass183_37.method4282((long) arg3.anInt8531, local7);
		return;
	}

	@OriginalMember(owner = "client!df", name = "f", descriptor = "(I)V")
	public static void method2093() {
		@Pc(15) Class23 local15 = null;
		try {
			@Pc(21) Class299 local21 = Static147.aClass161_4.method3815("2", true);
			while (local21.anInt7985 == 0) {
				Static55.method845(1L);
			}
			if (local21.anInt7985 == 1) {
				local15 = (Class23) local21.anObject41;
				@Pc(43) byte[] local43 = new byte[(int) local15.method498()];
				@Pc(57) int local57;
				for (@Pc(45) int local45 = 0; local45 < local43.length; local45 += local57) {
					local57 = local15.method492(local43.length - local45, local45, local43);
					if (local57 == -1) {
						throw new IOException("EOF");
					}
				}
				Static167.method3209(new Class4_Sub9(local43));
			}
		} catch (@Pc(85) Exception local85) {
		}
		try {
			if (local15 != null) {
				local15.method495();
			}
		} catch (@Pc(92) Exception local92) {
		}
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(III)Z")
	public static boolean method2096(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}
}
