import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!ea", name = "f", descriptor = "Lclient!ov;")
	public static Class179 aClass179_7;

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "Lclient!gp;")
	public static final Class87 aClass87_15 = new Class87(1, 4);

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "Lclient!bt;")
	public static final Class3_Sub2 aClass3_Sub2_7 = new Class3_Sub2(new byte[5000]);

	@OriginalMember(owner = "client!ea", name = "e", descriptor = "Lclient!pi;")
	public static final Class184 aClass184_127 = new Class184(55, 6);

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(B[Ljava/lang/String;II[S)V")
	public static void method3006(@OriginalArg(1) String[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) short[] arg3) {
		if (arg2 >= arg1) {
			return;
		}
		@Pc(13) int local13 = (arg2 + arg1) / 2;
		@Pc(15) int local15 = arg2;
		@Pc(19) String local19 = arg0[local13];
		arg0[local13] = arg0[arg1];
		arg0[arg1] = local19;
		@Pc(33) short local33 = arg3[local13];
		arg3[local13] = arg3[arg1];
		arg3[arg1] = local33;
		for (@Pc(45) int local45 = arg2; local45 < arg1; local45++) {
			if (local19 == null || arg0[local45] != null && arg0[local45].compareTo(local19) < (local45 & 0x1)) {
				@Pc(69) String local69 = arg0[local45];
				arg0[local45] = arg0[local15];
				arg0[local15] = local69;
				@Pc(83) short local83 = arg3[local45];
				arg3[local45] = arg3[local15];
				arg3[local15++] = local83;
			}
		}
		arg0[arg1] = arg0[local15];
		arg0[local15] = local19;
		arg3[arg1] = arg3[local15];
		arg3[local15] = local33;
		method3006(arg0, local15 - 1, arg2, arg3);
		method3006(arg0, arg1, local15 + 1, arg3);
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)V")
	public static void method3007() {
		for (@Pc(15) Class13_Sub8 local15 = (Class13_Sub8) Static182.aClass40_3.method1188(); local15 != null; local15 = (Class13_Sub8) Static182.aClass40_3.method1195()) {
			local15.method5947();
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIII)Z")
	public static boolean method3008(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static220.method3499(arg0, arg1, arg2)) {
			@Pc(10) int local10 = arg1 << Static287.anInt5248;
			@Pc(14) int local14 = arg2 << Static287.anInt5248;
			return Static386.method5263(local10 + 1, Static120.aClass64Array1[arg0].I(arg1, arg2) + arg3, local14 + 1) && Static386.method5263(local10 + Static122.anInt2633 - 1, Static120.aClass64Array1[arg0].I(arg1 + 1, arg2) + arg3, local14 + 1) && Static386.method5263(local10 + Static122.anInt2633 - 1, Static120.aClass64Array1[arg0].I(arg1 + 1, arg2 + 1) + arg3, local14 + Static122.anInt2633 - 1) && Static386.method5263(local10 + 1, Static120.aClass64Array1[arg0].I(arg1, arg2 + 1) + arg3, local14 + Static122.anInt2633 - 1);
		} else {
			return false;
		}
	}
}
