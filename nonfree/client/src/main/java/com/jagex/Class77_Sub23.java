package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ajw")
public class Class77_Sub23 extends Class77 {

	@OriginalMember(owner = "client!ajw", name = "s", descriptor = "I")
	public static final int anInt1536 = 8;

	@OriginalMember(owner = "client!ajw", name = "y", descriptor = "I")
	public static final int anInt1537 = 1;

	@OriginalMember(owner = "client!ajw", name = "q", descriptor = "I")
	public static final int anInt1538 = 5;

	@OriginalMember(owner = "client!ajw", name = "t", descriptor = "I")
	public static final int anInt1539 = 3;

	@OriginalMember(owner = "client!ajw", name = "x", descriptor = "I")
	static final int anInt1540 = 6;

	@OriginalMember(owner = "client!ajw", name = "d", descriptor = "I")
	public static final int anInt1541 = 7;

	@OriginalMember(owner = "client!ajw", name = "r", descriptor = "I")
	public static final int anInt1542 = 9;

	@OriginalMember(owner = "client!ajw", name = "g", descriptor = "I")
	public static final int anInt1543 = 10;

	@OriginalMember(owner = "client!ajw", name = "w", descriptor = "I")
	public static final int anInt1546 = 2;

	@OriginalMember(owner = "client!ajw", name = "l", descriptor = "I")
	public static final int anInt1547 = 0;

	@OriginalMember(owner = "client!ajw", name = "id", descriptor = "Lclient!ady;")
	public static Class80_Sub1_Sub2 aClass80_Sub1_Sub2_2;

	@OriginalMember(owner = "client!ajw", name = "z", descriptor = "I")
	int anInt1545;

	@OriginalMember(owner = "client!ajw", name = "j", descriptor = "I")
	int anInt1544;

	@OriginalMember(owner = "client!ajw", name = "i", descriptor = "[I")
	int[] anIntArray200;

	@OriginalMember(owner = "client!ajw", name = "k", descriptor = "[[I")
	int[][] anIntArrayArray38;

	@OriginalMember(owner = "client!ajw", name = "u", descriptor = "[Z")
	boolean[] aBooleanArray6;

	@OriginalMember(owner = "client!ajw", name = "e", descriptor = "[I")
	int[] anIntArray199;

	@OriginalMember(owner = "client!ajw", name = "<init>", descriptor = "(I[B)V", line = 24)
	Class77_Sub23(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt1545 = arg0 * 503639547;
		@Pc(11) Class77_Sub39 local11 = new Class77_Sub39(arg1);
		this.anInt1544 = local11.method22483() * 1583229655;
		this.anIntArray200 = new int[this.anInt1544 * -782210841];
		this.anIntArrayArray38 = new int[this.anInt1544 * -782210841][];
		this.aBooleanArray6 = new boolean[this.anInt1544 * -782210841];
		this.anIntArray199 = new int[this.anInt1544 * -782210841];
		@Pc(48) int local48;
		for (local48 = 0; local48 < this.anInt1544 * -782210841; local48++) {
			this.anIntArray200[local48] = local11.method22478();
			if (this.anIntArray200[local48] == 6) {
				this.anIntArray200[local48] = 2;
			}
		}
		for (local48 = 0; local48 < this.anInt1544 * -782210841; local48++) {
			this.aBooleanArray6[local48] = local11.method22478() == 1;
		}
		for (local48 = 0; local48 < this.anInt1544 * -782210841; local48++) {
			this.anIntArray199[local48] = local11.method22483();
		}
		for (local48 = 0; local48 < this.anInt1544 * -782210841; local48++) {
			this.anIntArrayArray38[local48] = new int[local11.method22537()];
		}
		for (local48 = 0; local48 < this.anInt1544 * -782210841; local48++) {
			for (@Pc(141) int local141 = 0; local141 < this.anIntArrayArray38[local48].length; local141++) {
				this.anIntArrayArray38[local48][local141] = local11.method22537();
			}
		}
	}

	@OriginalMember(owner = "client!ajw", name = "bb", descriptor = "(Lclient!yf;I)V", line = 4645)
	static final void method13597(@OriginalArg(0) Class665 arg0) {
		if (arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307] == 1) {
			arg0.anInt5786 += arg0.anIntArray535[arg0.anInt5786 * 662605117] * -793595371;
		}
	}
}
