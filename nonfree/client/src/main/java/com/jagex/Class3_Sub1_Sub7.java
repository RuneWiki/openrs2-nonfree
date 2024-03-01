package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aml")
public class Class3_Sub1_Sub7 extends Class3_Sub1 {

	@OriginalMember(owner = "client!aml", name = "m", descriptor = "Ljava/lang/String;")
	String aString111;

	@OriginalMember(owner = "client!aml", name = "s", descriptor = "Ljava/lang/String;")
	final String aString109;

	@OriginalMember(owner = "client!aml", name = "u", descriptor = "Ljava/lang/String;")
	final String aString110;

	@OriginalMember(owner = "client!aml", name = "y", descriptor = "I")
	final int anInt2668;

	@OriginalMember(owner = "client!aml", name = "q", descriptor = "I")
	int anInt2664;

	@OriginalMember(owner = "client!aml", name = "b", descriptor = "I")
	final int anInt2665;

	@OriginalMember(owner = "client!aml", name = "c", descriptor = "J")
	final long aLong154;

	@OriginalMember(owner = "client!aml", name = "j", descriptor = "I")
	final int anInt2666;

	@OriginalMember(owner = "client!aml", name = "n", descriptor = "I")
	final int anInt2667;

	@OriginalMember(owner = "client!aml", name = "z", descriptor = "Z")
	final boolean aBoolean470;

	@OriginalMember(owner = "client!aml", name = "e", descriptor = "Z")
	final boolean aBoolean469;

	@OriginalMember(owner = "client!aml", name = "r", descriptor = "J")
	final long aLong155;

	@OriginalMember(owner = "client!aml", name = "d", descriptor = "Z")
	final boolean aBoolean468;

	@OriginalMember(owner = "client!aml", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZJZ)V", line = 2022)
	Class3_Sub1_Sub7(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) long arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) long arg10, @OriginalArg(11) boolean arg11) {
		this.aString109 = arg1;
		this.aString110 = arg0;
		this.anInt2668 = arg2 * -1204675695;
		this.anInt2664 = arg3 * -1240636041;
		this.anInt2665 = arg4 * 399896993;
		this.aLong154 = arg5 * 4820848372922238501L;
		this.anInt2666 = arg6 * -126952385;
		this.anInt2667 = arg7 * 520613787;
		this.aBoolean470 = arg8;
		this.aBoolean469 = arg9;
		this.aLong155 = arg10 * -1733331833978051595L;
		this.aBoolean468 = arg11;
	}

	@OriginalMember(owner = "client!aml", name = "p", descriptor = "(B)J", line = 2038)
	public long method19010() {
		return this.aLong154 * -8018265419264301651L;
	}

	@OriginalMember(owner = "client!aml", name = "a", descriptor = "(I)J", line = 2042)
	public long method19006() {
		return this.aLong155 * 4089614541957148765L;
	}

	@OriginalMember(owner = "client!aml", name = "h", descriptor = "()J", line = 2042)
	public long method19007() {
		return this.aLong155 * 4089614541957148765L;
	}

	@OriginalMember(owner = "client!aml", name = "g", descriptor = "()J", line = 2042)
	public long method19008() {
		return this.aLong155 * 4089614541957148765L;
	}

	@OriginalMember(owner = "client!aml", name = "l", descriptor = "()J", line = 2042)
	public long method19009() {
		return this.aLong155 * 4089614541957148765L;
	}
}
