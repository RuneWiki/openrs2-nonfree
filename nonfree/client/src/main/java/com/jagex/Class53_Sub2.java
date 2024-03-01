package com.jagex;

import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!afc")
public class Class53_Sub2 extends Class53 {

	@OriginalMember(owner = "client!afc", name = "g", descriptor = "I")
	public int anInt1134;

	@OriginalMember(owner = "client!afc", name = "l", descriptor = "I")
	public int anInt1133;

	@OriginalMember(owner = "client!afc", name = "h", descriptor = "I")
	public int anInt1132;

	@OriginalMember(owner = "client!afc", name = "x", descriptor = "I")
	public int anInt1135;

	@OriginalMember(owner = "client!afc", name = "<init>", descriptor = "(IIII)V", line = 11)
	Class53_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1134 = arg0 * -1724623715;
		this.anInt1133 = arg1 * 1643954797;
		this.anInt1132 = arg2 * 2127311781;
		this.anInt1135 = arg3 * -732849177;
	}

	@OriginalMember(owner = "client!afc", name = "l", descriptor = "(IIII)V", line = 19)
	void method9972(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1134 = arg0 * -1724623715;
		this.anInt1133 = arg1 * 1643954797;
		this.anInt1132 = arg2 * 2127311781;
		this.anInt1135 = arg3 * -732849177;
	}

	@OriginalMember(owner = "client!afc", name = "g", descriptor = "(IIII)V", line = 19)
	void method9973(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1134 = arg0 * -1724623715;
		this.anInt1133 = arg1 * 1643954797;
		this.anInt1132 = arg2 * 2127311781;
		this.anInt1135 = arg3 * -732849177;
	}

	@OriginalMember(owner = "client!afc", name = "a", descriptor = "(IIIIS)V", line = 19)
	void method9974(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1134 = arg0 * -1724623715;
		this.anInt1133 = arg1 * 1643954797;
		this.anInt1132 = arg2 * 2127311781;
		this.anInt1135 = arg3 * -732849177;
	}

	@OriginalMember(owner = "client!afc", name = "a", descriptor = "(Ljava/io/File;II)[B", line = 21)
	static byte[] method9975(@OriginalArg(0) File arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(2) byte[] local2 = new byte[arg1];
			Class621.method33759(arg0, local2, arg1);
			return local2;
		} catch (@Pc(10) IOException local10) {
			return null;
		}
	}
}
