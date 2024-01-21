import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!c", name = "a", descriptor = "Lclient!mc;")
	public static Class42 aClass42_140 = Static23.method501("backleft2");

	@OriginalMember(owner = "client!c", name = "b", descriptor = "Lclient!mc;")
	public static Class42 aClass42_141 = Static23.method501("welle:");

	@OriginalMember(owner = "client!c", name = "d", descriptor = "I")
	public static int anInt251 = 0;

	@OriginalMember(owner = "client!c", name = "f", descriptor = "I")
	public static int anInt253 = 0;

	@OriginalMember(owner = "client!c", name = "g", descriptor = "I")
	public static int anInt254 = 2;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(JI)V")
	public static void method179(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static52.method979(arg0 - 1L);
			Static52.method979(1L);
		} else {
			Static52.method979(arg0);
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(I[B)[B")
	public static byte[] method180(@OriginalArg(1) byte[] arg0) {
		@Pc(13) Class1_Sub8 local13 = new Class1_Sub8(arg0);
		@Pc(17) int local17 = local13.method1186();
		@Pc(21) int local21 = local13.method1188();
		if (local21 < 0 || Static106.anInt2740 != 0 && local21 > Static106.anInt2740) {
			throw new RuntimeException();
		} else if (local17 == 0) {
			@Pc(98) byte[] local98 = new byte[local21];
			local13.method1217(local98, local21);
			return local98;
		} else {
			@Pc(41) int local41 = local13.method1188();
			if (local41 < 0 || Static106.anInt2740 != 0 && local41 > Static106.anInt2740) {
				throw new RuntimeException();
			}
			@Pc(62) byte[] local62 = new byte[local41];
			if (local17 == 1) {
				Static96.method1693(local62, local41, arg0, local21);
			} else {
				try {
					@Pc(78) DataInputStream local78 = new DataInputStream(new GZIPInputStream(new ByteArrayInputStream(arg0, 9, local21)));
					local78.readFully(local62);
					local78.close();
				} catch (@Pc(85) IOException local85) {
				}
			}
			return local62;
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(B)V")
	public static void method181() {
		aClass42_140 = null;
		aClass42_141 = null;
	}
}
