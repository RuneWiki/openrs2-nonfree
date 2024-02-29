package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!afn")
public class Class96_Sub12 extends Class96 {

	@OriginalMember(owner = "client!afn", name = "l", descriptor = "[Ljava/lang/String;")
	static String[] aStringArray10;

	@OriginalMember(owner = "client!afn", name = "c", descriptor = "I")
	final int anInt868;

	@OriginalMember(owner = "client!afn", name = "v", descriptor = "I")
	final int anInt869;

	@OriginalMember(owner = "client!afn", name = "<init>", descriptor = "(Lclient!akv;)V", line = 11)
	Class96_Sub12(@OriginalArg(0) Class77_Sub39 arg0) {
		super(arg0);
		this.anInt868 = arg0.method22483() * -1426945319;
		this.anInt869 = arg0.method22478() * -1564618203;
	}

	@OriginalMember(owner = "client!afn", name = "y", descriptor = "()V", line = 17)
	@Override
	public void method19912() {
		Class94_Sub4.aClass261_1.method26352(this.anInt868 * -1662823063);
	}

	@OriginalMember(owner = "client!afn", name = "c", descriptor = "(I)V", line = 17)
	@Override
	public void method19911() {
		Class94_Sub4.aClass261_1.method26352(this.anInt868 * -1662823063);
	}

	@OriginalMember(owner = "client!afn", name = "w", descriptor = "()V", line = 17)
	@Override
	public void method19913() {
		Class94_Sub4.aClass261_1.method26352(this.anInt868 * -1662823063);
	}

	@OriginalMember(owner = "client!afn", name = "q", descriptor = "()Z", line = 21)
	@Override
	boolean method19905() {
		Class94_Sub4.aClass261_1.method26337(this.anInt868 * -1662823063, this.anInt869 * -2028471891);
		return true;
	}

	@OriginalMember(owner = "client!afn", name = "l", descriptor = "(I)Z", line = 21)
	@Override
	boolean method19903() {
		Class94_Sub4.aClass261_1.method26337(this.anInt868 * -1662823063, this.anInt869 * -2028471891);
		return true;
	}

	@OriginalMember(owner = "client!afn", name = "t", descriptor = "()Z", line = 21)
	@Override
	boolean method19904() {
		Class94_Sub4.aClass261_1.method26337(this.anInt868 * -1662823063, this.anInt869 * -2028471891);
		return true;
	}

	@OriginalMember(owner = "client!afn", name = "aup", descriptor = "(Lclient!yf;B)V", line = 13022)
	static final void method7389(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class578.anInt5429 * 1970671679;
	}
}
