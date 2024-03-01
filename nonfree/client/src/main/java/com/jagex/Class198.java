package com.jagex;

import java.awt.Rectangle;
import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gi")
public class Class198 {

	@OriginalMember(owner = "client!gi", name = "ax", descriptor = "Ljava/io/File;")
	static File aFile1;

	@OriginalMember(owner = "client!gi", name = "p", descriptor = "Lclient!gi;")
	static final Class198 aClass198_4 = new Class198(0, true);

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "Lclient!gi;")
	static final Class198 aClass198_3 = new Class198(1, true);

	@OriginalMember(owner = "client!gi", name = "g", descriptor = "Lclient!gi;")
	static final Class198 aClass198_5 = new Class198(2, false);

	@OriginalMember(owner = "client!gi", name = "l", descriptor = "I")
	int anInt3688;

	@OriginalMember(owner = "client!gi", name = "h", descriptor = "Z")
	boolean aBoolean663;

	@OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(IZ)V", line = 10)
	Class198(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.anInt3688 = arg0 * 1303677441;
		this.aBoolean663 = arg1;
	}

	@OriginalMember(owner = "client!gi", name = "h", descriptor = "(I)Lclient!gi;", line = 16)
	public static Class198 method24125(@OriginalArg(0) int arg0) {
		if (aClass198_4.anInt3688 * 615478785 == arg0) {
			return aClass198_4;
		} else if (aClass198_3.anInt3688 * 615478785 == arg0) {
			return aClass198_3;
		} else if (aClass198_5.anInt3688 * 615478785 == arg0) {
			return aClass198_5;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(I)Lclient!gi;", line = 16)
	public static Class198 method24126(@OriginalArg(0) int arg0) {
		if (aClass198_4.anInt3688 * 615478785 == arg0) {
			return aClass198_4;
		} else if (aClass198_3.anInt3688 * 615478785 == arg0) {
			return aClass198_3;
		} else if (aClass198_5.anInt3688 * 615478785 == arg0) {
			return aClass198_5;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!gi", name = "g", descriptor = "(I)Lclient!gi;", line = 16)
	public static Class198 method24127(@OriginalArg(0) int arg0) {
		if (aClass198_4.anInt3688 * 615478785 == arg0) {
			return aClass198_4;
		} else if (aClass198_3.anInt3688 * 615478785 == arg0) {
			return aClass198_3;
		} else if (aClass198_5.anInt3688 * 615478785 == arg0) {
			return aClass198_5;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!gi", name = "l", descriptor = "(I)Lclient!gi;", line = 16)
	public static Class198 method24128(@OriginalArg(0) int arg0) {
		if (aClass198_4.anInt3688 * 615478785 == arg0) {
			return aClass198_4;
		} else if (aClass198_3.anInt3688 * 615478785 == arg0) {
			return aClass198_3;
		} else if (aClass198_5.anInt3688 * 615478785 == arg0) {
			return aClass198_5;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!gi", name = "ez", descriptor = "(Lclient!vs;I)V", line = 4861)
	static final void method24129(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		@Pc(14) Class186 local14 = local8.aClass186_4;
		Class146.method23082(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!gi", name = "jk", descriptor = "(IIIIB)V", line = 9458)
	static final void method24130(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(1) int local1 = 0; local1 < client.anInt3166 * 1457104959; local1++) {
			@Pc(10) Rectangle local10 = client.aRectangleArray1[local1];
			if (local10.x + local10.width > arg0 && local10.x < arg0 + arg2 && local10.height + local10.y > arg1 && local10.y < arg1 + arg3) {
				client.aBooleanArray19[local1] = true;
			}
		}
	}
}
