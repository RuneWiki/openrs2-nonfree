package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class Class324 {

	@OriginalMember(owner = "client!ik", name = "p", descriptor = "Lclient!ik;")
	public static final Class324 aClass324_1 = new Class324(0);

	@OriginalMember(owner = "client!ik", name = "c", descriptor = "Lclient!ik;")
	public static final Class324 aClass324_2 = new Class324(1);

	@OriginalMember(owner = "client!ik", name = "v", descriptor = "I")
	int anInt4080;

	@OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(I)V", line = 8)
	Class324(@OriginalArg(0) int arg0) {
		this.anInt4080 = arg0 * -1593565271;
	}

	@OriginalMember(owner = "client!ik", name = "c", descriptor = "(I)Lclient!ik;", line = 13)
	public static Class324 method27478(@OriginalArg(0) int arg0) {
		if (aClass324_1.anInt4080 * -855837543 == arg0) {
			return aClass324_1;
		} else if (aClass324_2.anInt4080 * -855837543 == arg0) {
			return aClass324_2;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ik", name = "v", descriptor = "(I)Lclient!ik;", line = 13)
	public static Class324 method27479(@OriginalArg(0) int arg0) {
		if (aClass324_1.anInt4080 * -855837543 == arg0) {
			return aClass324_1;
		} else if (aClass324_2.anInt4080 * -855837543 == arg0) {
			return aClass324_2;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ik", name = "q", descriptor = "(I)I", line = 151)
	public static int method27480() {
		return Class574.anInt5393 * -504964405;
	}
}
