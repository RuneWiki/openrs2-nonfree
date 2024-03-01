package com.jagex;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vh")
public class Class527 implements Interface56 {

	@OriginalMember(owner = "client!vh", name = "p", descriptor = "Lclient!vh;")
	public static final Class527 aClass527_6 = new Class527("", 4);

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "Lclient!vh;")
	public static final Class527 aClass527_11 = new Class527("", 3, new Class540[] { Class540.aClass540_2 });

	@OriginalMember(owner = "client!vh", name = "g", descriptor = "Lclient!vh;")
	static final Class527 aClass527_3 = new Class527("", 11, new Class540[] { Class540.aClass540_2 });

	@OriginalMember(owner = "client!vh", name = "l", descriptor = "Lclient!vh;")
	public static final Class527 aClass527_5 = new Class527("", 5, new Class540[] { Class540.aClass540_2, Class540.aClass540_3 });

	@OriginalMember(owner = "client!vh", name = "h", descriptor = "Lclient!vh;")
	static final Class527 aClass527_2 = new Class527("", 8, new Class540[] { Class540.aClass540_2, Class540.aClass540_3 });

	@OriginalMember(owner = "client!vh", name = "x", descriptor = "Lclient!vh;")
	public static final Class527 aClass527_4 = new Class527("", 2, new Class540[] { Class540.aClass540_2, Class540.aClass540_1 });

	@OriginalMember(owner = "client!vh", name = "s", descriptor = "Lclient!vh;")
	static final Class527 aClass527_7 = new Class527("", 9, new Class540[] { Class540.aClass540_2, Class540.aClass540_1 });

	@OriginalMember(owner = "client!vh", name = "u", descriptor = "Lclient!vh;")
	public static final Class527 aClass527_8 = new Class527("", 1, new Class540[] { Class540.aClass540_2, Class540.aClass540_3 });

	@OriginalMember(owner = "client!vh", name = "y", descriptor = "Lclient!vh;")
	static final Class527 aClass527_9 = new Class527("", 6, new Class540[] { Class540.aClass540_3 });

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "Lclient!vh;")
	public static final Class527 aClass527_10 = new Class527("", 0, new Class540[] { Class540.aClass540_3 });

	@OriginalMember(owner = "client!vh", name = "c", descriptor = "Lclient!vh;")
	public static final Class527 aClass527_12 = new Class527("", 10, new Class540[] { Class540.aClass540_2 });

	@OriginalMember(owner = "client!vh", name = "j", descriptor = "Ljava/util/Set;")
	final Set aSet2 = new HashSet();

	@OriginalMember(owner = "client!vh", name = "z", descriptor = "I")
	final int anInt5303;

	static {
		method32422();
	}

	@OriginalMember(owner = "client!vh", name = "y", descriptor = "()[Lclient!vh;", line = 33)
	public static Class527[] method32421() {
		return new Class527[] { aClass527_11, aClass527_9, aClass527_12, aClass527_4, aClass527_6, aClass527_7, aClass527_5, aClass527_10, aClass527_3, aClass527_2, aClass527_8 };
	}

	@OriginalMember(owner = "client!vh", name = "p", descriptor = "(B)[Lclient!vh;", line = 33)
	public static Class527[] method32422() {
		return new Class527[] { aClass527_11, aClass527_9, aClass527_12, aClass527_4, aClass527_6, aClass527_7, aClass527_5, aClass527_10, aClass527_3, aClass527_2, aClass527_8 };
	}

	@OriginalMember(owner = "client!vh", name = "s", descriptor = "()[Lclient!vh;", line = 33)
	public static Class527[] method32425() {
		return new Class527[] { aClass527_11, aClass527_9, aClass527_12, aClass527_4, aClass527_6, aClass527_7, aClass527_5, aClass527_10, aClass527_3, aClass527_2, aClass527_8 };
	}

	@OriginalMember(owner = "client!vh", name = "u", descriptor = "()[Lclient!vh;", line = 33)
	public static Class527[] method32426() {
		return new Class527[] { aClass527_11, aClass527_9, aClass527_12, aClass527_4, aClass527_6, aClass527_7, aClass527_5, aClass527_10, aClass527_3, aClass527_2, aClass527_8 };
	}

	@OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 36)
	Class527(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt5303 = arg1 * 516027993;
	}

	@OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(Ljava/lang/String;I[Lclient!vw;)V", line = 40)
	Class527(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class540[] arg2) {
		this.anInt5303 = arg1 * 516027993;
		@Pc(13) Class540[] local13 = arg2;
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			@Pc(23) Class540 local23 = local13[local15];
			this.aSet2.add(local23);
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)I", line = 52)
	@Override
	public int method33765() {
		return this.anInt5303 * -447352343;
	}

	@OriginalMember(owner = "client!vh", name = "x", descriptor = "()I", line = 52)
	@Override
	public int method33764() {
		return this.anInt5303 * -447352343;
	}

	@OriginalMember(owner = "client!vh", name = "h", descriptor = "()I", line = 52)
	@Override
	public int method33766() {
		return this.anInt5303 * -447352343;
	}

	@OriginalMember(owner = "client!vh", name = "l", descriptor = "()I", line = 52)
	@Override
	public int method33767() {
		return this.anInt5303 * -447352343;
	}

	@OriginalMember(owner = "client!vh", name = "g", descriptor = "(Lclient!vw;I)Z", line = 56)
	public boolean method32423(@OriginalArg(0) Class540 arg0) {
		return this.aSet2.contains(arg0);
	}

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "(Lclient!vw;)Z", line = 56)
	public boolean method32427(@OriginalArg(0) Class540 arg0) {
		return this.aSet2.contains(arg0);
	}

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "(Lclient!ahb;I)V", line = 422)
	public static void method32429(@OriginalArg(0) Class3_Sub41 arg0) {
		@Pc(2) byte[] local2 = new byte[24];
		try {
			Class390.aClass569_5.method32982(0L);
			Class390.aClass569_5.method32988(local2);
			@Pc(11) int local11;
			for (local11 = 0; local11 < 24 && local2[local11] == 0; local11++) {
			}
			if (local11 >= 24) {
				throw new IOException();
			}
		} catch (@Pc(31) Exception local31) {
			for (@Pc(33) int local33 = 0; local33 < 24; local33++) {
				local2[local33] = -1;
			}
		}
		arg0.method20248(local2, 0, 24);
	}

	@OriginalMember(owner = "client!vh", name = "al", descriptor = "(B)Lclient!ph;", line = 855)
	public static Class389 method32424() {
		return Class390.aClass389_2;
	}

	@OriginalMember(owner = "client!vh", name = "sp", descriptor = "(Lclient!vs;B)V", line = 7428)
	static final void method32428(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 624249098;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(23) int local23 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		@Pc(29) Class3_Sub42 local29 = (Class3_Sub42) client.aClass581_22.method33217((long) local13);
		if (local29 != null && local23 == local29.anInt2796 * 1705574607) {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = 1;
		} else {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = 0;
		}
	}
}
