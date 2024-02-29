package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ku")
public class Class366 {

	@OriginalMember(owner = "client!ku", name = "z", descriptor = "I")
	static final int anInt4540 = 16;

	@OriginalMember(owner = "client!ku", name = "p", descriptor = "Lclient!ku;")
	public static final Class366 aClass366_12 = new Class366(6, 0, 3, Class206.aClass206_19);

	@OriginalMember(owner = "client!ku", name = "c", descriptor = "Lclient!ku;")
	public static final Class366 aClass366_1 = new Class366(1, 1, 3, Class206.aClass206_19);

	@OriginalMember(owner = "client!ku", name = "v", descriptor = "Lclient!ku;")
	public static final Class366 aClass366_2 = new Class366(3, 2, 4, Class206.aClass206_23);

	@OriginalMember(owner = "client!ku", name = "l", descriptor = "Lclient!ku;")
	public static final Class366 aClass366_3 = new Class366(0, 3, 1, Class206.aClass206_19);

	@OriginalMember(owner = "client!ku", name = "y", descriptor = "Lclient!ku;")
	public static final Class366 aClass366_4 = new Class366(8, 4, 2, Class206.aClass206_19);

	@OriginalMember(owner = "client!ku", name = "w", descriptor = "Lclient!ku;")
	public static final Class366 aClass366_10 = new Class366(2, 5, 3, Class206.aClass206_19);

	@OriginalMember(owner = "client!ku", name = "t", descriptor = "Lclient!ku;")
	public static final Class366 aClass366_5 = new Class366(11, 6, 4, Class206.aClass206_19);

	@OriginalMember(owner = "client!ku", name = "q", descriptor = "Lclient!ku;")
	static final Class366 aClass366_6 = new Class366(10, 7, 4, Class206.aClass206_19);

	@OriginalMember(owner = "client!ku", name = "x", descriptor = "Lclient!ku;")
	static final Class366 aClass366_11 = new Class366(5, 8, 4, Class206.aClass206_19);

	@OriginalMember(owner = "client!ku", name = "d", descriptor = "Lclient!ku;")
	static final Class366 aClass366_8 = new Class366(7, 9, 4, Class206.aClass206_19);

	@OriginalMember(owner = "client!ku", name = "s", descriptor = "Lclient!ku;")
	static final Class366 aClass366_9 = new Class366(4, 10, 3, Class206.aClass206_19);

	@OriginalMember(owner = "client!ku", name = "r", descriptor = "Lclient!ku;")
	static final Class366 aClass366_7 = new Class366(9, 11, 3, Class206.aClass206_19);

	@OriginalMember(owner = "client!ku", name = "j", descriptor = "I")
	static final int anInt4541 = Class690.method36319(16);

	@OriginalMember(owner = "client!ku", name = "g", descriptor = "I")
	public final int anInt4539;

	@OriginalMember(owner = "client!ku", name = "i", descriptor = "I")
	final int anInt4537;

	@OriginalMember(owner = "client!ku", name = "u", descriptor = "I")
	final int anInt4538;

	@OriginalMember(owner = "client!ku", name = "e", descriptor = "Lclient!dl;")
	final Class206 aClass206_28;

	@OriginalMember(owner = "client!ku", name = "k", descriptor = "I")
	public final int anInt4542;

	@OriginalMember(owner = "client!ku", name = "<init>", descriptor = "(IIILclient!dl;)V", line = 28)
	Class366(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class206 arg3) {
		this.anInt4539 = arg0;
		this.anInt4537 = arg1;
		this.anInt4538 = arg2;
		this.aClass206_28 = arg3;
		this.anInt4542 = this.anInt4538 * this.aClass206_28.anInt3581 * 1899960707;
		if (this.anInt4537 >= 16) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ku", name = "p", descriptor = "(I)Lclient!ku;", line = 38)
	static Class366 method28139(@OriginalArg(0) int arg0) {
		switch(arg0) {
			case 0:
				return aClass366_12;
			case 1:
				return aClass366_1;
			case 2:
				return aClass366_2;
			case 3:
				return aClass366_3;
			case 4:
				return aClass366_4;
			case 5:
				return aClass366_10;
			case 6:
				return aClass366_5;
			default:
				return null;
		}
	}

	@OriginalMember(owner = "client!ku", name = "c", descriptor = "(I)Lclient!ku;", line = 38)
	static Class366 method28140(@OriginalArg(0) int arg0) {
		switch(arg0) {
			case 0:
				return aClass366_12;
			case 1:
				return aClass366_1;
			case 2:
				return aClass366_2;
			case 3:
				return aClass366_3;
			case 4:
				return aClass366_4;
			case 5:
				return aClass366_10;
			case 6:
				return aClass366_5;
			default:
				return null;
		}
	}
}
