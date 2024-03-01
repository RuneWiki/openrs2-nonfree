package com.jagex;

import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!amr")
public class Class166_Sub18 extends Class166 {

	@OriginalMember(owner = "client!amr", name = "w", descriptor = "I")
	static final int anInt2184 = 4;

	@OriginalMember(owner = "client!amr", name = "l", descriptor = "I")
	static final int anInt2185 = 0;

	@OriginalMember(owner = "client!amr", name = "<init>", descriptor = "(Lclient!ali;)V", line = 11)
	public Class166_Sub18(@OriginalArg(0) Class93_Sub36 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!amr", name = "<init>", descriptor = "(ILclient!ali;)V", line = 15)
	public Class166_Sub18(@OriginalArg(0) int arg0, @OriginalArg(1) Class93_Sub36 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!amr", name = "o", descriptor = "(I)V", line = 19)
	public void method15734() {
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 4) {
			this.anInt2379 = this.method16542() * -88839937;
		}
	}

	@OriginalMember(owner = "client!amr", name = "q", descriptor = "()V", line = 19)
	public void method15736() {
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 4) {
			this.anInt2379 = this.method16542() * -88839937;
		}
	}

	@OriginalMember(owner = "client!amr", name = "y", descriptor = "()V", line = 19)
	public void method15737() {
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 4) {
			this.anInt2379 = this.method16542() * -88839937;
		}
	}

	@OriginalMember(owner = "client!amr", name = "e", descriptor = "(B)I", line = 23)
	@Override
	int method16542() {
		return 0;
	}

	@OriginalMember(owner = "client!amr", name = "w", descriptor = "()I", line = 23)
	@Override
	int method16550() {
		return 0;
	}

	@OriginalMember(owner = "client!amr", name = "l", descriptor = "()I", line = 23)
	@Override
	int method16547() {
		return 0;
	}

	@OriginalMember(owner = "client!amr", name = "u", descriptor = "()I", line = 23)
	@Override
	int method16548() {
		return 0;
	}

	@OriginalMember(owner = "client!amr", name = "f", descriptor = "()I", line = 23)
	@Override
	int method16541() {
		return 0;
	}

	@OriginalMember(owner = "client!amr", name = "z", descriptor = "(I)I", line = 27)
	@Override
	int method16549(@OriginalArg(0) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!amr", name = "n", descriptor = "(II)I", line = 27)
	@Override
	int method16543(@OriginalArg(0) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!amr", name = "p", descriptor = "(I)I", line = 27)
	@Override
	int method16540(@OriginalArg(0) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!amr", name = "k", descriptor = "(II)V", line = 31)
	@Override
	void method16545(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!amr", name = "c", descriptor = "(I)V", line = 31)
	@Override
	void method16551(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!amr", name = "d", descriptor = "(I)V", line = 31)
	@Override
	void method16546(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!amr", name = "s", descriptor = "(B)I", line = 35)
	public int method15735() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!amr", name = "x", descriptor = "()I", line = 35)
	public int method15738() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!amr", name = "b", descriptor = "()I", line = 35)
	public int method15739() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!amr", name = "h", descriptor = "()I", line = 35)
	public int method15740() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!amr", name = "p", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)V", line = 177)
	public static void method15741(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) boolean arg3) {
		if (arg0.length() > 320 || !Class146_Sub2.method11709()) {
			return;
		}
		client.aClass175_1.method24355();
		Class358.method27778();
		Class411.aString200 = arg0;
		Class411.aString201 = arg1;
		Class411.aString199 = arg2;
		Class411.aBoolean751 = arg3;
		Class481.method29756(17);
	}

	@OriginalMember(owner = "client!amr", name = "dy", descriptor = "(I)V", line = 277)
	static void method15742() {
		@Pc(1) int local1 = -1;
		if (Class159_Sub1.aClass93_Sub1_Sub20_2 != null) {
			local1 = Class159_Sub1.aClass93_Sub1_Sub20_2.anInt3168 * 937363209;
		}
		Class47.method957();
		for (@Pc(13) int local13 = 0; local13 < 3; local13++) {
			for (@Pc(18) int local18 = 0; local18 < 5; local18++) {
				Class159_Sub1.aClass106ArrayArray1[local13][local18] = null;
				Class159_Sub1.aClass5ArrayArray1[local13][local18] = null;
			}
		}
		Class159_Sub1.aClass93_Sub1_Sub20_2 = null;
		if (local1 != -1) {
			Class267.method26248(local1, -1, -1, false);
		}
	}

	@OriginalMember(owner = "client!amr", name = "l", descriptor = "(Ljava/lang/String;Ljava/lang/String;ZI)Lclient!abl;", line = 353)
	public static Class38 method15743(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		@Pc(14) File local14 = new File(Class564.aFile4, "preferences" + arg0 + ".dat");
		if (local14.exists()) {
			try {
				return new Class38(local14, "rw", 10000L);
			} catch (@Pc(27) IOException local27) {
			}
		}
		@Pc(29) String local29 = "";
		if (Class366.anInt4584 * -1839644543 == 33) {
			local29 = "_rc";
		} else if (Class366.anInt4584 * -1839644543 == 34) {
			local29 = "_wip";
		}
		@Pc(65) File local65 = new File(Class485.aString216, "jagex_" + arg1 + "_preferences" + arg0 + local29 + ".dat");
		if (!arg2 && local65.exists()) {
			try {
				return new Class38(local65, "rw", 10000L);
			} catch (@Pc(80) IOException local80) {
			}
		}
		try {
			return new Class38(local14, "rw", 10000L);
		} catch (@Pc(90) IOException local90) {
			throw new RuntimeException();
		}
	}
}
