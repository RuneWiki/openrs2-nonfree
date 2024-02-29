package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!op")
public class Class448 implements Interface4 {

	@OriginalMember(owner = "client!op", name = "p", descriptor = "Lclient!pw;")
	final Class478 aClass478_120;

	@OriginalMember(owner = "client!op", name = "<init>", descriptor = "(Lclient!pw;)V", line = 10)
	Class448(@OriginalArg(0) Class478 arg0) {
		this.aClass478_120 = arg0;
	}

	@OriginalMember(owner = "client!op", name = "p", descriptor = "(I)I", line = 15)
	@Override
	public int method29477() {
		return this.aClass478_120.method29737() ? 100 : this.aClass478_120.method29743();
	}

	@OriginalMember(owner = "client!op", name = "v", descriptor = "()I", line = 15)
	@Override
	public int method29472() {
		return this.aClass478_120.method29737() ? 100 : this.aClass478_120.method29743();
	}

	@OriginalMember(owner = "client!op", name = "y", descriptor = "()I", line = 15)
	@Override
	public int method29474() {
		return this.aClass478_120.method29737() ? 100 : this.aClass478_120.method29743();
	}

	@OriginalMember(owner = "client!op", name = "l", descriptor = "()I", line = 15)
	@Override
	public int method29473() {
		return this.aClass478_120.method29737() ? 100 : this.aClass478_120.method29743();
	}

	@OriginalMember(owner = "client!op", name = "w", descriptor = "()Lclient!abc;", line = 20)
	@Override
	public Class29 method29476() {
		return Class29.aClass29_2;
	}

	@OriginalMember(owner = "client!op", name = "c", descriptor = "(I)Lclient!abc;", line = 20)
	@Override
	public Class29 method29471() {
		return Class29.aClass29_2;
	}

	@OriginalMember(owner = "client!op", name = "t", descriptor = "()Lclient!abc;", line = 20)
	@Override
	public Class29 method29470() {
		return Class29.aClass29_2;
	}

	@OriginalMember(owner = "client!op", name = "q", descriptor = "()Lclient!abc;", line = 20)
	@Override
	public Class29 method29475() {
		return Class29.aClass29_2;
	}

	@OriginalMember(owner = "client!op", name = "x", descriptor = "()Lclient!abc;", line = 20)
	@Override
	public Class29 method29478() {
		return Class29.aClass29_2;
	}

	@OriginalMember(owner = "client!op", name = "aof", descriptor = "(Lclient!yf;B)V", line = 12027)
	static final void method29225(@OriginalArg(0) Class665 arg0) {
		Class77_Sub13_Sub10.method21676();
	}
}
