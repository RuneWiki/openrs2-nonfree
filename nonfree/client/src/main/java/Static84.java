import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!fh", name = "i", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame1;

	@OriginalMember(owner = "client!fh", name = "o", descriptor = "Z")
	public static boolean aBoolean195 = true;

	@OriginalMember(owner = "client!fh", name = "r", descriptor = "S")
	public static short aShort28 = 205;

	@OriginalMember(owner = "client!fh", name = "v", descriptor = "Lclient!tn;")
	public static Interface6 anInterface6_1 = null;

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(B)V")
	public static void method1821() {
		@Pc(1) Class87 local1 = Static307.aClass87_54;
		synchronized (Static307.aClass87_54) {
			Static307.aClass87_54.method2477();
		}
		local1 = Static306.aClass87_53;
		synchronized (Static306.aClass87_53) {
			Static306.aClass87_53.method2477();
		}
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(B)V")
	public static void method1822() {
		Static329.aClass87_59.method2485();
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)V")
	public static void method1824() {
		Static68.aClass87_15.method2485();
		Static259.aClass87_26.method2485();
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IBIIII)V")
	public static void method1827(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(13) int local13 = arg1 + 1;
		Static39.method919(arg2, Static344.anIntArrayArray65[arg1], arg4, arg3);
		@Pc(26) int local26 = arg0 - 1;
		Static39.method919(arg2, Static344.anIntArrayArray65[arg0], arg4, arg3);
		for (@Pc(32) int local32 = local13; local32 <= local26; local32++) {
			@Pc(38) int[] local38 = Static344.anIntArrayArray65[local32];
			local38[arg3] = local38[arg4] = arg2;
		}
	}
}
