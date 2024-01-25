import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!fb", name = "Y", descriptor = "I")
	public static int anInt1730;

	@OriginalMember(owner = "client!fb", name = "V", descriptor = "Lclient!be;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!fb", name = "X", descriptor = "Lclient!nn;")
	public static final Class140 aClass140_45 = new Class140("Hidden", "Versteckt", "Caché", "Oculto");

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZIIIIZ)V")
	public static void method1795(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(14) long local14 = (long) (arg4 | (arg0 ? Integer.MIN_VALUE : 0));
		@Pc(20) Class2_Sub21 local20 = (Class2_Sub21) Static193.aClass41_20.method902(local14);
		if (local20 == null) {
			local20 = new Class2_Sub21();
			Static193.aClass41_20.method901(local20, local14);
		}
		if (arg1 >= local20.anIntArray245.length) {
			@Pc(55) int[] local55 = new int[arg1 + 1];
			@Pc(60) int[] local60 = new int[arg1 + 1];
			for (@Pc(62) int local62 = 0; local62 < local20.anIntArray245.length; local62++) {
				local55[local62] = local20.anIntArray245[local62];
				local60[local62] = local20.anIntArray247[local62];
			}
			for (@Pc(92) int local92 = local20.anIntArray245.length; local92 < arg1; local92++) {
				local55[local92] = -1;
				local60[local92] = 0;
			}
			local20.anIntArray245 = local55;
			local20.anIntArray247 = local60;
		}
		local20.anIntArray245[arg1] = arg3;
		local20.anIntArray247[arg1] = arg2;
	}

	@OriginalMember(owner = "client!fb", name = "h", descriptor = "(I)V")
	public static void method1796() {
		Static258.aClass107_37.method3012();
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(ILclient!ef;)V")
	public static void method1797(@OriginalArg(1) Class2_Sub12 arg0) {
		@Pc(13) byte[] local13 = new byte[24];
		if (Static220.aClass10_2 != null) {
			@Pc(25) int local25;
			try {
				Static220.aClass10_2.method184(0L);
				Static220.aClass10_2.method183(local13);
				for (local25 = 0; local25 < 24 && local13[local25] == 0; local25++) {
				}
				if (local25 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(49) Exception local49) {
				for (local25 = 0; local25 < 24; local25++) {
					local13[local25] = -1;
				}
			}
		}
		arg0.method3106(local13, 24);
	}
}
