package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!amb")
public class Class166_Sub2 extends Class166 {

	@OriginalMember(owner = "client!amb", name = "w", descriptor = "I")
	public static final int anInt2081 = 1;

	@OriginalMember(owner = "client!amb", name = "l", descriptor = "I")
	public static final int anInt2082 = 0;

	@OriginalMember(owner = "client!amb", name = "<init>", descriptor = "(Lclient!ali;)V", line = 11)
	public Class166_Sub2(@OriginalArg(0) Class93_Sub36 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!amb", name = "<init>", descriptor = "(ILclient!ali;)V", line = 15)
	public Class166_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) Class93_Sub36 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!amb", name = "o", descriptor = "(I)V", line = 19)
	public void method15372() {
		if (this.anInt2379 * 960141055 != 0 && this.aClass93_Sub36_49.aClass166_Sub46_1.method16529() != 1) {
			this.anInt2379 = 0;
		}
		if (this.anInt2379 * 960141055 != 0 && this.aClass93_Sub36_49.aClass166_Sub26_1.method15908() == 2) {
			this.anInt2379 = 0;
		}
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 1) {
			this.anInt2379 = this.method16542() * -88839937;
		}
	}

	@OriginalMember(owner = "client!amb", name = "q", descriptor = "()V", line = 19)
	public void method15377() {
		if (this.anInt2379 * 960141055 != 0 && this.aClass93_Sub36_49.aClass166_Sub46_1.method16529() != 1) {
			this.anInt2379 = 0;
		}
		if (this.anInt2379 * 960141055 != 0 && this.aClass93_Sub36_49.aClass166_Sub26_1.method15908() == 2) {
			this.anInt2379 = 0;
		}
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 1) {
			this.anInt2379 = this.method16542() * -88839937;
		}
	}

	@OriginalMember(owner = "client!amb", name = "x", descriptor = "()V", line = 19)
	public void method15378() {
		if (this.anInt2379 * 960141055 != 0 && this.aClass93_Sub36_49.aClass166_Sub46_1.method16529() != 1) {
			this.anInt2379 = 0;
		}
		if (this.anInt2379 * 960141055 != 0 && this.aClass93_Sub36_49.aClass166_Sub26_1.method15908() == 2) {
			this.anInt2379 = 0;
		}
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 1) {
			this.anInt2379 = this.method16542() * -88839937;
		}
	}

	@OriginalMember(owner = "client!amb", name = "b", descriptor = "()V", line = 19)
	public void method15379() {
		if (this.anInt2379 * 960141055 != 0 && this.aClass93_Sub36_49.aClass166_Sub46_1.method16529() != 1) {
			this.anInt2379 = 0;
		}
		if (this.anInt2379 * 960141055 != 0 && this.aClass93_Sub36_49.aClass166_Sub26_1.method15908() == 2) {
			this.anInt2379 = 0;
		}
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 1) {
			this.anInt2379 = this.method16542() * -88839937;
		}
	}

	@OriginalMember(owner = "client!amb", name = "f", descriptor = "()I", line = 25)
	@Override
	int method16541() {
		return 1;
	}

	@OriginalMember(owner = "client!amb", name = "e", descriptor = "(B)I", line = 25)
	@Override
	int method16542() {
		return 1;
	}

	@OriginalMember(owner = "client!amb", name = "w", descriptor = "()I", line = 25)
	@Override
	int method16550() {
		return 1;
	}

	@OriginalMember(owner = "client!amb", name = "l", descriptor = "()I", line = 25)
	@Override
	int method16547() {
		return 1;
	}

	@OriginalMember(owner = "client!amb", name = "u", descriptor = "()I", line = 25)
	@Override
	int method16548() {
		return 1;
	}

	@OriginalMember(owner = "client!amb", name = "s", descriptor = "(B)Z", line = 29)
	public boolean method15373() {
		return true;
	}

	@OriginalMember(owner = "client!amb", name = "h", descriptor = "()Z", line = 29)
	public boolean method15374() {
		return true;
	}

	@OriginalMember(owner = "client!amb", name = "a", descriptor = "()Z", line = 29)
	public boolean method15380() {
		return true;
	}

	@OriginalMember(owner = "client!amb", name = "g", descriptor = "()Z", line = 29)
	public boolean method15381() {
		return true;
	}

	@OriginalMember(owner = "client!amb", name = "n", descriptor = "(II)I", line = 33)
	@Override
	public int method16543(@OriginalArg(0) int arg0) {
		if (arg0 != 0 && this.aClass93_Sub36_49.aClass166_Sub26_1.method15908() == 2) {
			return 3;
		} else if (arg0 == 0 || this.aClass93_Sub36_49.aClass166_Sub46_1.method16529() == 1) {
			return 1;
		} else {
			return 2;
		}
	}

	@OriginalMember(owner = "client!amb", name = "p", descriptor = "(I)I", line = 33)
	@Override
	public int method16540(@OriginalArg(0) int arg0) {
		if (arg0 != 0 && this.aClass93_Sub36_49.aClass166_Sub26_1.method15908() == 2) {
			return 3;
		} else if (arg0 == 0 || this.aClass93_Sub36_49.aClass166_Sub46_1.method16529() == 1) {
			return 1;
		} else {
			return 2;
		}
	}

	@OriginalMember(owner = "client!amb", name = "z", descriptor = "(I)I", line = 33)
	@Override
	public int method16549(@OriginalArg(0) int arg0) {
		if (arg0 != 0 && this.aClass93_Sub36_49.aClass166_Sub26_1.method15908() == 2) {
			return 3;
		} else if (arg0 == 0 || this.aClass93_Sub36_49.aClass166_Sub46_1.method16529() == 1) {
			return 1;
		} else {
			return 2;
		}
	}

	@OriginalMember(owner = "client!amb", name = "c", descriptor = "(I)V", line = 39)
	@Override
	void method16551(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!amb", name = "k", descriptor = "(II)V", line = 39)
	@Override
	void method16545(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!amb", name = "d", descriptor = "(I)V", line = 39)
	@Override
	void method16546(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!amb", name = "t", descriptor = "()I", line = 43)
	public int method15375() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!amb", name = "y", descriptor = "(I)I", line = 43)
	public int method15376() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!amb", name = "i", descriptor = "()I", line = 43)
	public int method15382() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!amb", name = "j", descriptor = "()I", line = 43)
	public int method15383() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!amb", name = "ae", descriptor = "()I", line = 43)
	public int method15384() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!amb", name = "qo", descriptor = "(Lclient!yf;B)V", line = 7969)
	static final void method15385(@OriginalArg(0) Class681 arg0) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class132_Sub1_Sub3_Sub2.method12585(local11, local14, arg0);
	}
}
