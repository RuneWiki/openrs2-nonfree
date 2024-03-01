package com.jagex;

import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wc")
public class Class546 implements Iterable {

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "Lclient!ags;")
	Class3_Sub1 aClass3_Sub1_63;

	@OriginalMember(owner = "client!wc", name = "p", descriptor = "Lclient!ags;")
	public Class3_Sub1 aClass3_Sub1_62 = new Class3_Sub1();

	@OriginalMember(owner = "client!wc", name = "p", descriptor = "(Ljava/lang/CharSequence;I)I", line = 9)
	public static int method32649(@OriginalArg(0) CharSequence arg0) {
		@Pc(2) int local2 = arg0.length();
		@Pc(4) int local4 = 0;
		for (@Pc(6) int local6 = 0; local6 < local2; local6++) {
			@Pc(13) char local13 = arg0.charAt(local6);
			if (local13 <= 127) {
				local4++;
			} else if (local13 <= 2047) {
				local4 += 2;
			} else {
				local4 += 3;
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!wc", name = "<init>", descriptor = "()V", line = 10)
	public Class546() {
		this.aClass3_Sub1_62.aClass3_Sub1_66 = this.aClass3_Sub1_62;
		this.aClass3_Sub1_62.aClass3_Sub1_67 = this.aClass3_Sub1_62;
	}

	@OriginalMember(owner = "client!wc", name = "p", descriptor = "(I)V", line = 16)
	public void method32620() {
		while (this.aClass3_Sub1_62 != this.aClass3_Sub1_62.aClass3_Sub1_66) {
			this.aClass3_Sub1_62.aClass3_Sub1_66.method33669();
		}
	}

	@OriginalMember(owner = "client!wc", name = "j", descriptor = "()V", line = 16)
	public void method32631() {
		while (this.aClass3_Sub1_62 != this.aClass3_Sub1_62.aClass3_Sub1_66) {
			this.aClass3_Sub1_62.aClass3_Sub1_66.method33669();
		}
	}

	@OriginalMember(owner = "client!wc", name = "n", descriptor = "()V", line = 16)
	public void method32632() {
		while (this.aClass3_Sub1_62 != this.aClass3_Sub1_62.aClass3_Sub1_66) {
			this.aClass3_Sub1_62.aClass3_Sub1_66.method33669();
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!ags;I)V", line = 22)
	public void method32621(@OriginalArg(0) Class3_Sub1 arg0) {
		if (arg0.aClass3_Sub1_67 != null) {
			arg0.method33669();
		}
		arg0.aClass3_Sub1_67 = this.aClass3_Sub1_62.aClass3_Sub1_67;
		arg0.aClass3_Sub1_66 = this.aClass3_Sub1_62;
		arg0.aClass3_Sub1_67.aClass3_Sub1_66 = arg0;
		arg0.aClass3_Sub1_66.aClass3_Sub1_67 = arg0;
	}

	@OriginalMember(owner = "client!wc", name = "e", descriptor = "(Lclient!ags;)V", line = 22)
	public void method32625(@OriginalArg(0) Class3_Sub1 arg0) {
		if (arg0.aClass3_Sub1_67 != null) {
			arg0.method33669();
		}
		arg0.aClass3_Sub1_67 = this.aClass3_Sub1_62.aClass3_Sub1_67;
		arg0.aClass3_Sub1_66 = this.aClass3_Sub1_62;
		arg0.aClass3_Sub1_67.aClass3_Sub1_66 = arg0;
		arg0.aClass3_Sub1_66.aClass3_Sub1_67 = arg0;
	}

	@OriginalMember(owner = "client!wc", name = "q", descriptor = "(Lclient!ags;)V", line = 22)
	public void method32635(@OriginalArg(0) Class3_Sub1 arg0) {
		if (arg0.aClass3_Sub1_67 != null) {
			arg0.method33669();
		}
		arg0.aClass3_Sub1_67 = this.aClass3_Sub1_62.aClass3_Sub1_67;
		arg0.aClass3_Sub1_66 = this.aClass3_Sub1_62;
		arg0.aClass3_Sub1_67.aClass3_Sub1_66 = arg0;
		arg0.aClass3_Sub1_66.aClass3_Sub1_67 = arg0;
	}

	@OriginalMember(owner = "client!wc", name = "d", descriptor = "(Lclient!ags;)V", line = 22)
	public void method32636(@OriginalArg(0) Class3_Sub1 arg0) {
		if (arg0.aClass3_Sub1_67 != null) {
			arg0.method33669();
		}
		arg0.aClass3_Sub1_67 = this.aClass3_Sub1_62.aClass3_Sub1_67;
		arg0.aClass3_Sub1_66 = this.aClass3_Sub1_62;
		arg0.aClass3_Sub1_67.aClass3_Sub1_66 = arg0;
		arg0.aClass3_Sub1_66.aClass3_Sub1_67 = arg0;
	}

	@OriginalMember(owner = "client!wc", name = "r", descriptor = "(Lclient!ags;)V", line = 22)
	public void method32642(@OriginalArg(0) Class3_Sub1 arg0) {
		if (arg0.aClass3_Sub1_67 != null) {
			arg0.method33669();
		}
		arg0.aClass3_Sub1_67 = this.aClass3_Sub1_62.aClass3_Sub1_67;
		arg0.aClass3_Sub1_66 = this.aClass3_Sub1_62;
		arg0.aClass3_Sub1_67.aClass3_Sub1_66 = arg0;
		arg0.aClass3_Sub1_66.aClass3_Sub1_67 = arg0;
	}

	@OriginalMember(owner = "client!wc", name = "m", descriptor = "(Lclient!ags;Lclient!ags;)V", line = 30)
	public static void method32638(@OriginalArg(0) Class3_Sub1 arg0, @OriginalArg(1) Class3_Sub1 arg1) {
		if (arg0.aClass3_Sub1_67 != null) {
			arg0.method33669();
		}
		arg0.aClass3_Sub1_67 = arg1.aClass3_Sub1_67;
		arg0.aClass3_Sub1_66 = arg1;
		arg0.aClass3_Sub1_67.aClass3_Sub1_66 = arg0;
		arg0.aClass3_Sub1_66.aClass3_Sub1_67 = arg0;
	}

	@OriginalMember(owner = "client!wc", name = "v", descriptor = "(Lclient!ags;Lclient!ags;)V", line = 38)
	public static void method32637(@OriginalArg(0) Class3_Sub1 arg0, @OriginalArg(1) Class3_Sub1 arg1) {
		if (arg0.aClass3_Sub1_67 != null) {
			arg0.method33669();
		}
		arg0.aClass3_Sub1_67 = arg1;
		arg0.aClass3_Sub1_66 = arg1.aClass3_Sub1_66;
		arg0.aClass3_Sub1_67.aClass3_Sub1_66 = arg0;
		arg0.aClass3_Sub1_66.aClass3_Sub1_67 = arg0;
	}

	@OriginalMember(owner = "client!wc", name = "u", descriptor = "(I)Lclient!ags;", line = 46)
	public Class3_Sub1 method32622() {
		@Pc(3) Class3_Sub1 local3 = this.aClass3_Sub1_62.aClass3_Sub1_66;
		if (this.aClass3_Sub1_62 == local3) {
			return null;
		} else {
			local3.method33669();
			return local3;
		}
	}

	@OriginalMember(owner = "client!wc", name = "w", descriptor = "()Lclient!ags;", line = 46)
	public Class3_Sub1 method32639() {
		@Pc(3) Class3_Sub1 local3 = this.aClass3_Sub1_62.aClass3_Sub1_66;
		if (this.aClass3_Sub1_62 == local3) {
			return null;
		} else {
			local3.method33669();
			return local3;
		}
	}

	@OriginalMember(owner = "client!wc", name = "t", descriptor = "()Lclient!ags;", line = 46)
	public Class3_Sub1 method32641() {
		@Pc(3) Class3_Sub1 local3 = this.aClass3_Sub1_62.aClass3_Sub1_66;
		if (this.aClass3_Sub1_62 == local3) {
			return null;
		} else {
			local3.method33669();
			return local3;
		}
	}

	@OriginalMember(owner = "client!wc", name = "i", descriptor = "()Lclient!ags;", line = 53)
	public Class3_Sub1 method32619() {
		return this.method32624(null);
	}

	@OriginalMember(owner = "client!wc", name = "y", descriptor = "(I)Lclient!ags;", line = 53)
	public Class3_Sub1 method32623() {
		return this.method32624(null);
	}

	@OriginalMember(owner = "client!wc", name = "o", descriptor = "()Lclient!ags;", line = 53)
	public Class3_Sub1 method32640() {
		return this.method32624(null);
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(Lclient!ags;S)Lclient!ags;", line = 58)
	Class3_Sub1 method32624(@OriginalArg(0) Class3_Sub1 arg0) {
		@Pc(6) Class3_Sub1 local6;
		if (arg0 == null) {
			local6 = this.aClass3_Sub1_62.aClass3_Sub1_66;
		} else {
			local6 = arg0;
		}
		if (local6 == this.aClass3_Sub1_62) {
			this.aClass3_Sub1_63 = null;
			return null;
		} else {
			this.aClass3_Sub1_63 = local6.aClass3_Sub1_66;
			return local6;
		}
	}

	@OriginalMember(owner = "client!wc", name = "k", descriptor = "(Lclient!ags;)Lclient!ags;", line = 58)
	Class3_Sub1 method32633(@OriginalArg(0) Class3_Sub1 arg0) {
		@Pc(6) Class3_Sub1 local6;
		if (arg0 == null) {
			local6 = this.aClass3_Sub1_62.aClass3_Sub1_66;
		} else {
			local6 = arg0;
		}
		if (local6 == this.aClass3_Sub1_62) {
			this.aClass3_Sub1_63 = null;
			return null;
		} else {
			this.aClass3_Sub1_63 = local6.aClass3_Sub1_66;
			return local6;
		}
	}

	@OriginalMember(owner = "client!wc", name = "f", descriptor = "(Lclient!ags;)Lclient!ags;", line = 58)
	Class3_Sub1 method32634(@OriginalArg(0) Class3_Sub1 arg0) {
		@Pc(6) Class3_Sub1 local6;
		if (arg0 == null) {
			local6 = this.aClass3_Sub1_62.aClass3_Sub1_66;
		} else {
			local6 = arg0;
		}
		if (local6 == this.aClass3_Sub1_62) {
			this.aClass3_Sub1_63 = null;
			return null;
		} else {
			this.aClass3_Sub1_63 = local6.aClass3_Sub1_66;
			return local6;
		}
	}

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "(I)Lclient!ags;", line = 69)
	public Class3_Sub1 method32645() {
		@Pc(2) Class3_Sub1 local2 = this.aClass3_Sub1_63;
		if (local2 == this.aClass3_Sub1_62) {
			this.aClass3_Sub1_63 = null;
			return null;
		} else {
			this.aClass3_Sub1_63 = local2.aClass3_Sub1_66;
			return local2;
		}
	}

	@OriginalMember(owner = "client!wc", name = "z", descriptor = "(I)I", line = 79)
	public int method32626() {
		@Pc(1) int local1 = 0;
		for (@Pc(5) Class3_Sub1 local5 = this.aClass3_Sub1_62.aClass3_Sub1_66; local5 != this.aClass3_Sub1_62; local5 = local5.aClass3_Sub1_66) {
			local1++;
		}
		return local1;
	}

	@OriginalMember(owner = "client!wc", name = "ak", descriptor = "()I", line = 79)
	public int method32627() {
		@Pc(1) int local1 = 0;
		for (@Pc(5) Class3_Sub1 local5 = this.aClass3_Sub1_62.aClass3_Sub1_66; local5 != this.aClass3_Sub1_62; local5 = local5.aClass3_Sub1_66) {
			local1++;
		}
		return local1;
	}

	@OriginalMember(owner = "client!wc", name = "at", descriptor = "()I", line = 79)
	public int method32643() {
		@Pc(1) int local1 = 0;
		for (@Pc(5) Class3_Sub1 local5 = this.aClass3_Sub1_62.aClass3_Sub1_66; local5 != this.aClass3_Sub1_62; local5 = local5.aClass3_Sub1_66) {
			local1++;
		}
		return local1;
	}

	@OriginalMember(owner = "client!wc", name = "af", descriptor = "()I", line = 79)
	public int method32644() {
		@Pc(1) int local1 = 0;
		for (@Pc(5) Class3_Sub1 local5 = this.aClass3_Sub1_62.aClass3_Sub1_66; local5 != this.aClass3_Sub1_62; local5 = local5.aClass3_Sub1_66) {
			local1++;
		}
		return local1;
	}

	@OriginalMember(owner = "client!wc", name = "l", descriptor = "()Ljava/util/Iterator;", line = 89)
	public Iterator method32628() {
		return new Class549(this);
	}

	@OriginalMember(owner = "client!wc", name = "h", descriptor = "()Ljava/util/Iterator;", line = 89)
	public Iterator method32629() {
		return new Class549(this);
	}

	@OriginalMember(owner = "client!wc", name = "x", descriptor = "()Ljava/util/Iterator;", line = 89)
	public Iterator method32630() {
		return new Class549(this);
	}

	@OriginalMember(owner = "client!wc", name = "iterator", descriptor = "()Ljava/util/Iterator;", line = 89)
	@Override
	public Iterator iterator() {
		return new Class549(this);
	}

	@OriginalMember(owner = "client!wc", name = "y", descriptor = "(IIIIIII)J", line = 105)
	public static long method32646(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Class599.aCalendar3.clear();
		Class599.aCalendar3.set(arg5, arg4, arg3, arg2, arg1, arg0);
		return Class599.aCalendar3.getTime().getTime();
	}

	@OriginalMember(owner = "client!wc", name = "fx", descriptor = "(IZI)V", line = 1930)
	public static void method32647(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		Class159.method23206(arg0, Class601.aClass601_152.method33512(Class469.aClass530_2), arg1);
	}

	@OriginalMember(owner = "client!wc", name = "ei", descriptor = "(Lclient!vs;I)V", line = 4912)
	static final void method32648(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		@Pc(22) Class186 local22 = Class178.aClass186Array1[local12 >> 16];
		Class177.method23423(local16, local22, arg0);
	}
}
