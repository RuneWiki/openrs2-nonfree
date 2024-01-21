import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!jh", name = "D", descriptor = "Lclient!a;")
	public static Class1 aClass1_26;

	@OriginalMember(owner = "client!jh", name = "F", descriptor = "I")
	public static int anInt2220;

	@OriginalMember(owner = "client!jh", name = "H", descriptor = "[I")
	public static int[] anIntArray209;

	@OriginalMember(owner = "client!jh", name = "C", descriptor = "I")
	public static int anInt2219 = 0;

	@OriginalMember(owner = "client!jh", name = "E", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_819 = Static177.method3050("Bitte versuchen Sie)1");

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IZ)I")
	public static int method1724(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(I[Lclient!da;[III[I)V")
	public static void method1726(@OriginalArg(0) int arg0, @OriginalArg(1) Class19[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4) {
		if (arg0 >= arg3) {
			return;
		}
		@Pc(19) int local19 = (arg0 + arg3) / 2;
		@Pc(23) int local23 = arg0 - 1;
		@Pc(27) int local27 = arg3 + 1;
		@Pc(31) Class19 local31 = arg1[local19];
		arg1[local19] = arg1[arg0];
		arg1[arg0] = local31;
		while (local23 < local27) {
			@Pc(45) boolean local45 = true;
			@Pc(48) int local48;
			@Pc(62) int local62;
			@Pc(65) int local65;
			do {
				local27--;
				for (local48 = 0; local48 < 4; local48++) {
					if (arg2[local48] == 2) {
						local62 = arg1[local27].anInt756;
						local65 = local31.anInt756;
					} else if (arg2[local48] == 1) {
						local65 = local31.anInt759;
						local62 = arg1[local27].anInt759;
						if (local65 == -1 && arg4[local48] == 1) {
							local65 = 2001;
						}
						if (local62 == -1 && arg4[local48] == 1) {
							local62 = 2001;
						}
					} else if (arg2[local48] == 3) {
						local65 = local31.aBoolean39 ? 1 : 0;
						local62 = arg1[local27].aBoolean39 ? 1 : 0;
					} else {
						local65 = local31.anInt761;
						local62 = arg1[local27].anInt761;
					}
					if (local62 != local65) {
						if ((arg4[local48] != 1 || local65 >= local62) && (arg4[local48] != 0 || local62 >= local65)) {
							local45 = false;
						}
						break;
					}
					if (local48 == 3) {
						local45 = false;
					}
				}
			} while (local45);
			local45 = true;
			do {
				local23++;
				for (local48 = 0; local48 < 4; local48++) {
					if (arg2[local48] == 2) {
						local62 = arg1[local23].anInt756;
						local65 = local31.anInt756;
					} else if (arg2[local48] == 1) {
						local65 = local31.anInt759;
						if (local65 == -1 && arg4[local48] == 1) {
							local65 = 2001;
						}
						local62 = arg1[local23].anInt759;
						if (local62 == -1 && arg4[local48] == 1) {
							local62 = 2001;
						}
					} else if (arg2[local48] == 3) {
						local62 = arg1[local23].aBoolean39 ? 1 : 0;
						local65 = local31.aBoolean39 ? 1 : 0;
					} else {
						local62 = arg1[local23].anInt761;
						local65 = local31.anInt761;
					}
					if (local65 != local62) {
						if ((arg4[local48] != 1 || local65 <= local62) && (arg4[local48] != 0 || local65 >= local62)) {
							local45 = false;
						}
						break;
					}
					if (local48 == 3) {
						local45 = false;
					}
				}
			} while (local45);
			if (local27 > local23) {
				@Pc(334) Class19 local334 = arg1[local23];
				arg1[local23] = arg1[local27];
				arg1[local27] = local334;
			}
		}
		method1726(arg0, arg1, arg2, local27, arg4);
		method1726(local27 + 1, arg1, arg2, arg3, arg4);
	}
}
