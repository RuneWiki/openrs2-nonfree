import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!kb", name = "q", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_762 = Static161.method2452("Members object");

	@OriginalMember(owner = "client!kb", name = "z", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_766 = Static161.method2452("Please try using a different world)3");

	@OriginalMember(owner = "client!kb", name = "s", descriptor = "Lclient!dc;")
	public static Class20 aClass20_763 = aClass20_766;

	@OriginalMember(owner = "client!kb", name = "v", descriptor = "Lclient!dc;")
	public static Class20 aClass20_764 = aClass20_766;

	@OriginalMember(owner = "client!kb", name = "y", descriptor = "Lclient!dc;")
	public static Class20 aClass20_765 = aClass20_766;

	@OriginalMember(owner = "client!kb", name = "B", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_767 = Static161.method2452(":chalreq:");

	@OriginalMember(owner = "client!kb", name = "C", descriptor = "Lclient!dc;")
	public static Class20 aClass20_768 = aClass20_766;

	@OriginalMember(owner = "client!kb", name = "E", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_769 = Static161.method2452("gr-Un:");

	@OriginalMember(owner = "client!kb", name = "I", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_770 = Static161.method2452("zur-Uck auf die RuneScape)2Webseite gehen");

	@OriginalMember(owner = "client!kb", name = "J", descriptor = "Lclient!dc;")
	public static Class20 aClass20_771 = aClass20_766;

	@OriginalMember(owner = "client!kb", name = "K", descriptor = "I")
	public static int anInt2043 = -1;

	@OriginalMember(owner = "client!kb", name = "L", descriptor = "Lclient!dc;")
	public static Class20 aClass20_772 = aClass20_762;

	@OriginalMember(owner = "client!kb", name = "M", descriptor = "Lclient!dc;")
	public static Class20 aClass20_773 = aClass20_766;

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIBLclient!bi;Ljava/awt/Component;)Lclient!bc;")
	public static Class9 method1565(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class12 arg2, @OriginalArg(4) Component arg3) {
		if (Static62.anInt1362 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(36) Class9 local36 = (Class9) Class.forName("Class9_Sub2").getDeclaredConstructor().newInstance();
			local36.anIntArray408 = new int[(Static30.aBoolean37 ? 2 : 1) * 256];
			local36.anInt3886 = arg0;
			local36.method2937(arg3);
			local36.anInt3882 = (arg0 & -1024) + 1024;
			if (local36.anInt3882 > 16384) {
				local36.anInt3882 = 16384;
			}
			local36.method2942(local36.anInt3882);
			if (Static119.anInt2486 > 0 && Static56.aClass38_1 == null) {
				Static56.aClass38_1 = new Class38();
				Static56.aClass38_1.aClass12_2 = arg2;
				arg2.method297(Static119.anInt2486, Static56.aClass38_1);
			}
			if (Static56.aClass38_1 != null) {
				if (Static56.aClass38_1.aClass9Array1[arg1] != null) {
					throw new IllegalArgumentException();
				}
				Static56.aClass38_1.aClass9Array1[arg1] = local36;
			}
			return local36;
		} catch (@Pc(114) Throwable local114) {
			try {
				@Pc(120) Class9_Sub1 local120 = new Class9_Sub1(arg2, arg1);
				local120.anInt3886 = arg0;
				local120.anIntArray408 = new int[(Static30.aBoolean37 ? 2 : 1) * 256];
				local120.method2937(arg3);
				local120.anInt3882 = 16384;
				local120.method2942(local120.anInt3882);
				if (Static119.anInt2486 > 0 && Static56.aClass38_1 == null) {
					Static56.aClass38_1 = new Class38();
					Static56.aClass38_1.aClass12_2 = arg2;
					arg2.method297(Static119.anInt2486, Static56.aClass38_1);
				}
				if (Static56.aClass38_1 != null) {
					if (Static56.aClass38_1.aClass9Array1[arg1] != null) {
						throw new IllegalArgumentException();
					}
					Static56.aClass38_1.aClass9Array1[arg1] = local120;
				}
				return local120;
			} catch (@Pc(182) Throwable local182) {
				return new Class9();
			}
		}
	}
}
