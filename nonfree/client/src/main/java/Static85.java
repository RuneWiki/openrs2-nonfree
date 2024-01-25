import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!dd", name = "v", descriptor = "[[B")
	public static byte[][] aByteArrayArray6;

	@OriginalMember(owner = "client!dd", name = "P", descriptor = "I")
	public static int anInt1574;

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(ZI)V")
	public static void method1562(@OriginalArg(0) boolean arg0) {
		if (Static113.aClass282_1 == null) {
			Static420.method6569();
		}
		if (arg0) {
			Static113.aClass282_1.method6824();
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lclient!r;Lclient!la;ZILclient!gda;Ljava/lang/String;)V")
	public static void method1575(@OriginalArg(0) Class44 arg0, @OriginalArg(1) Class58 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) Class114 arg3, @OriginalArg(5) String arg4) {
		@Pc(16) boolean local16 = !Static20.aBoolean18 || Static407.method6449();
		if (!local16) {
			return;
		}
		@Pc(30) int local30;
		@Pc(39) int local39;
		if (Static20.aBoolean18 && local16) {
			@Pc(138) Class114 local138 = Static258.aClass114_10;
			@Pc(144) Class58 local144 = arg0.method4983(local138, Static393.aClass261Array1);
			local30 = local138.method2948(250, null, arg4);
			local39 = local138.method2952(250, arg4, null, local138.anInt3290);
			@Pc(165) int local165 = Static404.aClass261_2.anInt7655;
			@Pc(169) int local169 = local165 + 4;
			local39 += local169 * 2;
			local30 += local169 * 2;
			if (local30 < Static383.anInt7371) {
				local30 = Static383.anInt7371;
			}
			if (local39 < Static462.anInt8629) {
				local39 = Static462.anInt8629;
			}
			@Pc(203) int local203 = Static508.aClass258_10.method6279(Static501.anInt6750, local30) + Static133.anInt2855;
			@Pc(212) int local212 = Static82.aClass250_2.method6077(local39, Static212.anInt3952) + Static512.anInt9192;
			arg0.method5018(Static447.aClass261_3, false).DA(local203 + Static16.aClass261_1.anInt7655, Static16.aClass261_1.anInt7660 + local212, local30 - Static16.aClass261_1.anInt7655 * 2, -(Static16.aClass261_1.anInt7660 * 2) + local39, 1, 0, 0);
			arg0.method5018(Static16.aClass261_1, true).method8185(local203, local212);
			Static16.aClass261_1.method6319();
			arg0.method5018(Static16.aClass261_1, true).method8185(local203 + local30 - local165, local212);
			Static16.aClass261_1.method6324();
			arg0.method5018(Static16.aClass261_1, true).method8185(local203 + local30 - local165, -local165 + local212 + local39);
			Static16.aClass261_1.method6319();
			arg0.method5018(Static16.aClass261_1, true).method8185(local203, local212 + local39 - local165);
			Static16.aClass261_1.method6324();
			arg0.method5018(Static404.aClass261_2, true).method8184(local203, Static16.aClass261_1.anInt7660 + local212, local165, local39 - Static16.aClass261_1.anInt7660 * 2);
			Static404.aClass261_2.method6322();
			arg0.method5018(Static404.aClass261_2, true).method8184(local203 + Static16.aClass261_1.anInt7655, local212, local30 - Static16.aClass261_1.anInt7655 * 2, local165);
			Static404.aClass261_2.method6322();
			arg0.method5018(Static404.aClass261_2, true).method8184(local203 + local30 - local165, Static16.aClass261_1.anInt7660 + local212, local165, local39 - Static16.aClass261_1.anInt7660 * 2);
			Static404.aClass261_2.method6322();
			arg0.method5018(Static404.aClass261_2, true).method8184(Static16.aClass261_1.anInt7655 + local203, -local165 + (local212 - -local39), local30 - Static16.aClass261_1.anInt7655 * 2, local165);
			Static404.aClass261_2.method6322();
			local144.method8159(1, Static113.anInt2667 | 0xFF000000, 0, null, arg4, local30 - local169 * 2, -1, 0, null, local169 + local212, null, local39 - local169 * 2, local203 + local169, 0, 1);
			Static82.method1377(local212, local30, local39, local203);
		} else {
			local30 = arg3.method2948(250, null, arg4);
			local39 = arg3.method2951(arg4, 250, null) * 13;
			arg0.J(6, 6, local30 + 4 + 4, local39 + 8, -16777216, 0);
			arg0.method4996(6, 6, local30 + 4 + 4, local39 - -8, -1, 0);
			arg1.method8159(1, -1, 0, null, arg4, local30, -1, 0, null, 10, null, local39, 10, 0, 1);
			Static82.method1377(6, local30 + 4 + 4, local39 + 4 + 4, 6);
		}
		if (arg2) {
			try {
				arg0.method5013();
			} catch (@Pc(439) Exception_Sub1 local439) {
			}
		}
	}
}
