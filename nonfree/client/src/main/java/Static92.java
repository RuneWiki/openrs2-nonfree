import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(IZZ)V")
	public static void method1552(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (arg0) {
			Static485.anInt8240--;
			if (Static485.anInt8240 == 0) {
				Static303.anIntArray531 = null;
			}
		}
		if (arg1) {
			Static456.anInt7762--;
			if (Static456.anInt7762 == 0) {
				Static205.anIntArray530 = null;
			}
		}
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(JB)V")
	public static void method1553(@OriginalArg(0) long arg0) {
		@Pc(7) int local7 = Static49.anInt971;
		@Pc(14) int local14;
		@Pc(22) int local22;
		if (local7 != Static454.anInt7698) {
			local14 = local7 - Static454.anInt7698;
			local22 = (int) (arg0 * (long) local14 / 320L);
			if (local14 <= 0) {
				if (local22 == 0) {
					local22 = -1;
				} else if (local22 < local14) {
					local22 = local14;
				}
			} else if (local22 == 0) {
				local22 = 1;
			} else if (local22 > local14) {
				local22 = local14;
			}
			Static454.anInt7698 += local22;
		}
		@Pc(65) int local65 = Static528.anInt8946;
		Static509.aFloat152 += (float) arg0 * Static642.aFloat200 / 40.0F * 8.0F;
		Static170.aFloat71 += Static202.aFloat79 * (float) arg0 / 40.0F * 8.0F;
		if (Static94.anInt1851 != local65) {
			local14 = local65 - Static94.anInt1851;
			local22 = (int) (arg0 * (long) local14 / 320L);
			if (local14 <= 0) {
				if (local22 == 0) {
					local22 = -1;
				} else if (local14 > local22) {
					local22 = local14;
				}
			} else if (local22 == 0) {
				local22 = 1;
			} else if (local22 > local14) {
				local22 = local14;
			}
			Static94.anInt1851 += local22;
		}
		Static549.method7848();
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(Ljava/net/Socket;ZI)Lclient!nh;")
	public static Class197 method1554(@OriginalArg(0) Socket arg0) throws IOException {
		return new Class197_Sub1(arg0, 7500);
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(ILclient!uv;)V")
	public static void method1555(@OriginalArg(1) Class344 arg0) {
		@Pc(7) Class344 local7 = Static565.method6923(arg0);
		@Pc(13) int local13;
		@Pc(11) int local11;
		if (local7 == null) {
			local11 = Static190.anInt3576;
			local13 = Static330.anInt6254;
		} else {
			local13 = local7.anInt9546;
			local11 = local7.anInt9602;
		}
		Static132.method2344(local13, false, arg0, local11);
		Static428.method6535(local11, local13, arg0);
	}
}
