import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!dfa", name = "l", descriptor = "I")
	public static int anInt1998 = -1;

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(I[Ljava/lang/String;II)Ljava/lang/String;")
	public static String method1756(@OriginalArg(0) int arg0, @OriginalArg(1) String[] arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			return "";
		} else if (arg0 == 1) {
			@Pc(19) String local19 = arg1[arg2];
			return local19 == null ? "null" : local19.toString();
		} else {
			@Pc(30) int local30 = arg2 + arg0;
			@Pc(32) int local32 = 0;
			for (@Pc(34) int local34 = arg2; local34 < local30; local34++) {
				@Pc(40) String local40 = arg1[local34];
				if (local40 == null) {
					local32 += 4;
				} else {
					local32 += local40.length();
				}
			}
			@Pc(68) StringBuffer local68 = new StringBuffer(local32);
			for (@Pc(70) int local70 = arg2; local70 < local30; local70++) {
				@Pc(76) String local76 = arg1[local70];
				if (local76 == null) {
					local68.append("null");
				} else {
					local68.append(local76);
				}
			}
			return local68.toString();
		}
	}

	@OriginalMember(owner = "client!dfa", name = "b", descriptor = "(I)V")
	public static void method1761() {
		Static349.aClass206_3.method4717();
		Static396.aClass56_4.method1619();
		Static412.aClass93_1.method2204();
		Static146.aClass214_1.method4894();
		Static183.aClass182_1.method4060();
		Static46.aClass234_1.method5395();
		Static594.aClass311_2.method7008();
		Static592.aClass98_2.method2300();
		Static558.aClass32_1.method1004();
		Static189.aClass39_1.method1239();
		Static161.aClass291_1.method6673();
		Static299.aClass46_4.method1407();
		Static74.aClass184_1.method4080();
		Static88.aClass183_1.method4069();
		Static83.aClass255_1.method5730();
		Static117.aClass345_1.method7551();
		Static395.aClass263_1.method5841();
		Static395.aClass335_1.method7408();
		Static470.aClass352_2.method7715();
		Static545.aClass194_1.method4315();
		Static215.method3561();
		Static314.method4792();
		Static183.method3226();
		Static411.method5767();
		Static75.method1616();
		Static390.aClass326_36.method7241(5);
		Static492.aClass326_49.method7241(5);
		Static595.aClass326_60.method7241(5);
		Static237.aClass326_17.method7241(5);
		Static145.aClass326_12.method7241(5);
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(ILjava/io/File;Z[B)V")
	public static void method1762(@OriginalArg(0) int arg0, @OriginalArg(1) File arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		@Pc(14) DataInputStream local14 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg1)));
		try {
			local14.readFully(arg2, 0, arg0);
		} catch (@Pc(26) EOFException local26) {
		}
		local14.close();
	}
}
