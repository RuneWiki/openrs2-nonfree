package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class Class322 {

	@OriginalMember(owner = "client!mj", name = "p", descriptor = "Lclient!mx;")
	public Class335 aClass335_5 = new Class335();

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "Lclient!mh;")
	public Class320 aClass320_61 = new Class320();

	@OriginalMember(owner = "client!mj", name = "<init>", descriptor = "()V", line = 7)
	public Class322() {
	}

	@OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(Lclient!mj;)V", line = 12)
	public Class322(@OriginalArg(0) Class322 arg0) {
		this.method25982(arg0);
	}

	@OriginalMember(owner = "client!mj", name = "p", descriptor = "(Lclient!mj;)V", line = 19)
	public void method25982(@OriginalArg(0) Class322 arg0) {
		this.aClass335_5.method26315(arg0.aClass335_5);
		this.aClass320_61.method25893(arg0.aClass320_61);
	}

	@OriginalMember(owner = "client!mj", name = "h", descriptor = "()V", line = 24)
	public final void method25981() {
		this.aClass335_5.method26351();
		this.aClass320_61.method25870();
		this.aClass320_61.method25889(this.aClass335_5);
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "()V", line = 24)
	public final void method25983() {
		this.aClass335_5.method26351();
		this.aClass320_61.method25870();
		this.aClass320_61.method25889(this.aClass335_5);
	}

	@OriginalMember(owner = "client!mj", name = "l", descriptor = "()V", line = 24)
	public final void method25985() {
		this.aClass335_5.method26351();
		this.aClass320_61.method25870();
		this.aClass320_61.method25889(this.aClass335_5);
	}

	@OriginalMember(owner = "client!mj", name = "g", descriptor = "(Lclient!mj;)V", line = 30)
	public final void method25984(@OriginalArg(0) Class322 arg0) {
		this.aClass335_5.method26312(arg0.aClass335_5);
		this.aClass320_61.method25889(arg0.aClass335_5);
		this.aClass320_61.method25872(arg0.aClass320_61);
	}

	@OriginalMember(owner = "client!mj", name = "toString", descriptor = "()Ljava/lang/String;", line = 37)
	@Override
	public String toString() {
		return "[" + this.aClass335_5.toString() + "|" + this.aClass320_61.toString() + "]";
	}

	@OriginalMember(owner = "client!mj", name = "ou", descriptor = "()Ljava/lang/String;", line = 37)
	public String method25986() {
		return "[" + this.aClass335_5.toString() + "|" + this.aClass320_61.toString() + "]";
	}

	@OriginalMember(owner = "client!mj", name = "ox", descriptor = "()Ljava/lang/String;", line = 37)
	public String method25987() {
		return "[" + this.aClass335_5.toString() + "|" + this.aClass320_61.toString() + "]";
	}
}
