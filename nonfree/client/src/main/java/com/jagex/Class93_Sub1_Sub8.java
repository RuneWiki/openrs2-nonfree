package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!arn")
public class Class93_Sub1_Sub8 extends Class93_Sub1 {

	@OriginalMember(owner = "client!arn", name = "z", descriptor = "I")
	int anInt3013;

	@OriginalMember(owner = "client!arn", name = "l", descriptor = "Ljava/lang/String;")
	final String aString101;

	@OriginalMember(owner = "client!arn", name = "u", descriptor = "Lclient!aap;")
	final Class18 aClass18_10;

	@OriginalMember(owner = "client!arn", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 1962)
	Class93_Sub1_Sub8(@OriginalArg(0) String arg0) {
		this.aString101 = arg0;
		this.aClass18_10 = new Class18();
	}

	@OriginalMember(owner = "client!arn", name = "k", descriptor = "()I", line = 1968)
	int method21715() {
		return this.aClass18_10.aClass93_Sub1_4 == this.aClass18_10.aClass93_Sub1_4.aClass93_Sub1_68 ? -1 : ((Class93_Sub1_Sub7) this.aClass18_10.aClass93_Sub1_4.aClass93_Sub1_68).anInt3012 * -92627949;
	}

	@OriginalMember(owner = "client!arn", name = "e", descriptor = "(I)I", line = 1968)
	int method21719() {
		return this.aClass18_10.aClass93_Sub1_4 == this.aClass18_10.aClass93_Sub1_4.aClass93_Sub1_68 ? -1 : ((Class93_Sub1_Sub7) this.aClass18_10.aClass93_Sub1_4.aClass93_Sub1_68).anInt3012 * -92627949;
	}

	@OriginalMember(owner = "client!arn", name = "w", descriptor = "()I", line = 1968)
	int method21720() {
		return this.aClass18_10.aClass93_Sub1_4 == this.aClass18_10.aClass93_Sub1_4.aClass93_Sub1_68 ? -1 : ((Class93_Sub1_Sub7) this.aClass18_10.aClass93_Sub1_4.aClass93_Sub1_68).anInt3012 * -92627949;
	}

	@OriginalMember(owner = "client!arn", name = "f", descriptor = "()I", line = 1968)
	int method21721() {
		return this.aClass18_10.aClass93_Sub1_4 == this.aClass18_10.aClass93_Sub1_4.aClass93_Sub1_68 ? -1 : ((Class93_Sub1_Sub7) this.aClass18_10.aClass93_Sub1_4.aClass93_Sub1_68).anInt3012 * -92627949;
	}

	@OriginalMember(owner = "client!arn", name = "l", descriptor = "(Lclient!arm;)Z", line = 1973)
	boolean method21716(@OriginalArg(0) Class93_Sub1_Sub7 arg0) {
		@Pc(1) boolean local1 = true;
		arg0.method23976();
		@Pc(10) Class93_Sub1_Sub7 local10 = (Class93_Sub1_Sub7) this.aClass18_10.method246();
		while (local10 != null) {
			if (Class19_Sub3.method17555(arg0.anInt3012 * -92627949, local10.anInt3012 * -92627949)) {
				Class615.method32087(arg0, local10);
				this.anInt3013 += -280530287;
				return !local1;
			}
			local10 = (Class93_Sub1_Sub7) this.aClass18_10.method253();
			local1 = false;
		}
		this.aClass18_10.method268(arg0);
		this.anInt3013 += -280530287;
		return local1;
	}

	@OriginalMember(owner = "client!arn", name = "n", descriptor = "(Lclient!arm;I)Z", line = 1973)
	boolean method21717(@OriginalArg(0) Class93_Sub1_Sub7 arg0) {
		@Pc(1) boolean local1 = true;
		arg0.method23976();
		@Pc(10) Class93_Sub1_Sub7 local10 = (Class93_Sub1_Sub7) this.aClass18_10.method246();
		while (local10 != null) {
			if (Class19_Sub3.method17555(arg0.anInt3012 * -92627949, local10.anInt3012 * -92627949)) {
				Class615.method32087(arg0, local10);
				this.anInt3013 += -280530287;
				return !local1;
			}
			local10 = (Class93_Sub1_Sub7) this.aClass18_10.method253();
			local1 = false;
		}
		this.aClass18_10.method268(arg0);
		this.anInt3013 += -280530287;
		return local1;
	}

	@OriginalMember(owner = "client!arn", name = "m", descriptor = "(Lclient!arm;S)Z", line = 1988)
	boolean method21718(@OriginalArg(0) Class93_Sub1_Sub7 arg0) {
		@Pc(3) int local3 = this.method21719();
		arg0.method23976();
		this.anInt3013 -= -280530287;
		if (this.anInt3013 * -2109043087 != 0) {
			return local3 != this.method21719();
		}
		this.method23969();
		this.method23976();
		Class454.anInt5039 -= 1842152815;
		Class454.aClass240_85.method25830(this, arg0.aLong155 * 7070093341456026777L);
		return false;
	}

	@OriginalMember(owner = "client!arn", name = "u", descriptor = "(Lclient!arm;)Z", line = 1988)
	boolean method21722(@OriginalArg(0) Class93_Sub1_Sub7 arg0) {
		@Pc(3) int local3 = this.method21719();
		arg0.method23976();
		this.anInt3013 -= -280530287;
		if (this.anInt3013 * -2109043087 != 0) {
			return local3 != this.method21719();
		}
		this.method23969();
		this.method23976();
		Class454.anInt5039 -= 1842152815;
		Class454.aClass240_85.method25830(this, arg0.aLong155 * 7070093341456026777L);
		return false;
	}
}
