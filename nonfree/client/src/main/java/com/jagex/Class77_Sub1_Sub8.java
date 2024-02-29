package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ara")
public class Class77_Sub1_Sub8 extends Class77_Sub1 {

	@OriginalMember(owner = "client!ara", name = "r", descriptor = "I")
	int anInt3005 = 332354067;

	@OriginalMember(owner = "client!ara", name = "g", descriptor = "I")
	public int anInt3006 = 682622281;

	@OriginalMember(owner = "client!ara", name = "z", descriptor = "I")
	public int anInt3003 = -1286750208;

	@OriginalMember(owner = "client!ara", name = "j", descriptor = "I")
	public int anInt3008 = 0;

	@OriginalMember(owner = "client!ara", name = "i", descriptor = "I")
	public int anInt3009 = -1274920960;

	@OriginalMember(owner = "client!ara", name = "k", descriptor = "I")
	public int anInt3010 = 0;

	@OriginalMember(owner = "client!ara", name = "u", descriptor = "Z")
	boolean aBoolean495 = true;

	@OriginalMember(owner = "client!ara", name = "t", descriptor = "I")
	public int anInt3004;

	@OriginalMember(owner = "client!ara", name = "q", descriptor = "Ljava/lang/String;")
	public String aString105;

	@OriginalMember(owner = "client!ara", name = "x", descriptor = "Ljava/lang/String;")
	public String aString104;

	@OriginalMember(owner = "client!ara", name = "s", descriptor = "I")
	public int anInt3007;

	@OriginalMember(owner = "client!ara", name = "d", descriptor = "Lclient!zm;")
	Class695 aClass695_41;

	@OriginalMember(owner = "client!ara", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V", line = 24)
	Class77_Sub1_Sub8(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt3004 = arg0 * 1334334759;
		this.aString105 = arg1;
		this.aString104 = arg2;
		this.anInt3007 = arg3 * -232489577;
		this.anInt3005 = arg4 * -332354067;
		this.aBoolean495 = arg5;
		this.anInt3006 = arg6 * -682622281;
		if (this.anInt3006 * 646871815 == 255) {
			this.anInt3006 = 0;
		}
		Class199.method25491(arg7);
		this.aClass695_41 = new Class695();
	}

	@OriginalMember(owner = "client!ara", name = "p", descriptor = "(III)Z", line = 38)
	boolean method21859(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(5) Class77_Sub34 local5 = (Class77_Sub34) this.aClass695_41.method36395(); local5 != null; local5 = (Class77_Sub34) this.aClass695_41.method36406()) {
			if (local5.method14271(arg0, arg1)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ara", name = "x", descriptor = "(II)Z", line = 38)
	boolean method21860(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(5) Class77_Sub34 local5 = (Class77_Sub34) this.aClass695_41.method36395(); local5 != null; local5 = (Class77_Sub34) this.aClass695_41.method36406()) {
			if (local5.method14271(arg0, arg1)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ara", name = "q", descriptor = "(II)Z", line = 38)
	boolean method21861(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(5) Class77_Sub34 local5 = (Class77_Sub34) this.aClass695_41.method36395(); local5 != null; local5 = (Class77_Sub34) this.aClass695_41.method36406()) {
			if (local5.method14271(arg0, arg1)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ara", name = "c", descriptor = "(II[II)Z", line = 45)
	public boolean method21862(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		for (@Pc(5) Class77_Sub34 local5 = (Class77_Sub34) this.aClass695_41.method36395(); local5 != null; local5 = (Class77_Sub34) this.aClass695_41.method36406()) {
			if (local5.method14274(arg0, arg1)) {
				local5.method14277(arg0, arg1, arg2);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ara", name = "d", descriptor = "(II[I)Z", line = 45)
	public boolean method21863(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		for (@Pc(5) Class77_Sub34 local5 = (Class77_Sub34) this.aClass695_41.method36395(); local5 != null; local5 = (Class77_Sub34) this.aClass695_41.method36406()) {
			if (local5.method14274(arg0, arg1)) {
				local5.method14277(arg0, arg1, arg2);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ara", name = "v", descriptor = "(II[II)Z", line = 55)
	public boolean method21864(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		for (@Pc(5) Class77_Sub34 local5 = (Class77_Sub34) this.aClass695_41.method36395(); local5 != null; local5 = (Class77_Sub34) this.aClass695_41.method36406()) {
			if (local5.method14271(arg0, arg1)) {
				local5.method14280(arg0, arg1, arg2);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ara", name = "s", descriptor = "(II[I)Z", line = 55)
	public boolean method21865(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		for (@Pc(5) Class77_Sub34 local5 = (Class77_Sub34) this.aClass695_41.method36395(); local5 != null; local5 = (Class77_Sub34) this.aClass695_41.method36406()) {
			if (local5.method14271(arg0, arg1)) {
				local5.method14280(arg0, arg1, arg2);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ara", name = "l", descriptor = "(III[II)Z", line = 65)
	public boolean method21866(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		for (@Pc(5) Class77_Sub34 local5 = (Class77_Sub34) this.aClass695_41.method36395(); local5 != null; local5 = (Class77_Sub34) this.aClass695_41.method36406()) {
			if (local5.method14272(arg0, arg1, arg2)) {
				local5.method14280(arg1, arg2, arg3);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ara", name = "z", descriptor = "(III[I)Z", line = 65)
	public boolean method21867(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		for (@Pc(5) Class77_Sub34 local5 = (Class77_Sub34) this.aClass695_41.method36395(); local5 != null; local5 = (Class77_Sub34) this.aClass695_41.method36406()) {
			if (local5.method14272(arg0, arg1, arg2)) {
				local5.method14280(arg1, arg2, arg3);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ara", name = "r", descriptor = "(III[I)Z", line = 65)
	public boolean method21868(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		for (@Pc(5) Class77_Sub34 local5 = (Class77_Sub34) this.aClass695_41.method36395(); local5 != null; local5 = (Class77_Sub34) this.aClass695_41.method36406()) {
			if (local5.method14272(arg0, arg1, arg2)) {
				local5.method14280(arg1, arg2, arg3);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ara", name = "j", descriptor = "(III[I)Z", line = 65)
	public boolean method21869(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		for (@Pc(5) Class77_Sub34 local5 = (Class77_Sub34) this.aClass695_41.method36395(); local5 != null; local5 = (Class77_Sub34) this.aClass695_41.method36406()) {
			if (local5.method14272(arg0, arg1, arg2)) {
				local5.method14280(arg1, arg2, arg3);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ara", name = "g", descriptor = "(III[I)Z", line = 65)
	public boolean method21870(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		for (@Pc(5) Class77_Sub34 local5 = (Class77_Sub34) this.aClass695_41.method36395(); local5 != null; local5 = (Class77_Sub34) this.aClass695_41.method36406()) {
			if (local5.method14272(arg0, arg1, arg2)) {
				local5.method14280(arg1, arg2, arg3);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ara", name = "a", descriptor = "()V", line = 75)
	void method21871() {
		this.anInt3003 = -1286750208;
		this.anInt3008 = 0;
		this.anInt3009 = -1274920960;
		this.anInt3010 = 0;
		for (@Pc(17) Class77_Sub34 local17 = (Class77_Sub34) this.aClass695_41.method36395(); local17 != null; local17 = (Class77_Sub34) this.aClass695_41.method36406()) {
			if (local17.anInt1745 * -1934072337 < this.anInt3003 * -192382841) {
				this.anInt3003 = local17.anInt1745 * -338146983;
			}
			if (local17.anInt1747 * 105883891 > this.anInt3008 * 36458189) {
				this.anInt3008 = local17.anInt1747 * -2014816577;
			}
			if (local17.anInt1740 * 1816020231 < this.anInt3009 * -1004159431) {
				this.anInt3009 = local17.anInt1740 * 1671961919;
			}
			if (local17.anInt1748 * -1577710271 > this.anInt3010 * 189160645) {
				this.anInt3010 = local17.anInt1748 * -1742082483;
			}
		}
	}

	@OriginalMember(owner = "client!ara", name = "b", descriptor = "()V", line = 75)
	void method21872() {
		this.anInt3003 = -1286750208;
		this.anInt3008 = 0;
		this.anInt3009 = -1274920960;
		this.anInt3010 = 0;
		for (@Pc(17) Class77_Sub34 local17 = (Class77_Sub34) this.aClass695_41.method36395(); local17 != null; local17 = (Class77_Sub34) this.aClass695_41.method36406()) {
			if (local17.anInt1745 * -1934072337 < this.anInt3003 * -192382841) {
				this.anInt3003 = local17.anInt1745 * -338146983;
			}
			if (local17.anInt1747 * 105883891 > this.anInt3008 * 36458189) {
				this.anInt3008 = local17.anInt1747 * -2014816577;
			}
			if (local17.anInt1740 * 1816020231 < this.anInt3009 * -1004159431) {
				this.anInt3009 = local17.anInt1740 * 1671961919;
			}
			if (local17.anInt1748 * -1577710271 > this.anInt3010 * 189160645) {
				this.anInt3010 = local17.anInt1748 * -1742082483;
			}
		}
	}

	@OriginalMember(owner = "client!ara", name = "n", descriptor = "()V", line = 75)
	void method21873() {
		this.anInt3003 = -1286750208;
		this.anInt3008 = 0;
		this.anInt3009 = -1274920960;
		this.anInt3010 = 0;
		for (@Pc(17) Class77_Sub34 local17 = (Class77_Sub34) this.aClass695_41.method36395(); local17 != null; local17 = (Class77_Sub34) this.aClass695_41.method36406()) {
			if (local17.anInt1745 * -1934072337 < this.anInt3003 * -192382841) {
				this.anInt3003 = local17.anInt1745 * -338146983;
			}
			if (local17.anInt1747 * 105883891 > this.anInt3008 * 36458189) {
				this.anInt3008 = local17.anInt1747 * -2014816577;
			}
			if (local17.anInt1740 * 1816020231 < this.anInt3009 * -1004159431) {
				this.anInt3009 = local17.anInt1740 * 1671961919;
			}
			if (local17.anInt1748 * -1577710271 > this.anInt3010 * 189160645) {
				this.anInt3010 = local17.anInt1748 * -1742082483;
			}
		}
	}

	@OriginalMember(owner = "client!ara", name = "y", descriptor = "(I)V", line = 75)
	void method21874() {
		this.anInt3003 = -1286750208;
		this.anInt3008 = 0;
		this.anInt3009 = -1274920960;
		this.anInt3010 = 0;
		for (@Pc(17) Class77_Sub34 local17 = (Class77_Sub34) this.aClass695_41.method36395(); local17 != null; local17 = (Class77_Sub34) this.aClass695_41.method36406()) {
			if (local17.anInt1745 * -1934072337 < this.anInt3003 * -192382841) {
				this.anInt3003 = local17.anInt1745 * -338146983;
			}
			if (local17.anInt1747 * 105883891 > this.anInt3008 * 36458189) {
				this.anInt3008 = local17.anInt1747 * -2014816577;
			}
			if (local17.anInt1740 * 1816020231 < this.anInt3009 * -1004159431) {
				this.anInt3009 = local17.anInt1740 * 1671961919;
			}
			if (local17.anInt1748 * -1577710271 > this.anInt3010 * 189160645) {
				this.anInt3010 = local17.anInt1748 * -1742082483;
			}
		}
	}

	@OriginalMember(owner = "client!ara", name = "m", descriptor = "(Lclient!pw;I)Lclient!ara;", line = 88)
	static Class77_Sub1_Sub8 method21875(@OriginalArg(0) Class478 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class77_Sub39 local8 = new Class77_Sub39(arg0.method29725(0, arg1));
		return Class424.method28739(local8, arg1);
	}

	@OriginalMember(owner = "client!ara", name = "ai", descriptor = "(Lclient!pw;I)Lclient!ara;", line = 88)
	static Class77_Sub1_Sub8 method21876(@OriginalArg(0) Class478 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class77_Sub39 local8 = new Class77_Sub39(arg0.method29725(0, arg1));
		return Class424.method28739(local8, arg1);
	}

	@OriginalMember(owner = "client!ara", name = "ag", descriptor = "(Lclient!akv;I)Lclient!ara;", line = 93)
	static Class77_Sub1_Sub8 method21877(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
		@Pc(30) Class77_Sub1_Sub8 local30 = new Class77_Sub1_Sub8(arg1, arg0.method22523(), arg0.method22523(), arg0.method22500(), arg0.method22500(), arg0.method22478() == 1, arg0.method22478(), arg0.method22478());
		@Pc(34) int local34 = arg0.method22478();
		for (@Pc(36) int local36 = 0; local36 < local34; local36++) {
			local30.aClass695_41.method36383(new Class77_Sub34(arg0.method22478(), arg0.method22483(), arg0.method22483(), arg0.method22483(), arg0.method22483(), arg0.method22483(), arg0.method22483(), arg0.method22483(), arg0.method22483()));
		}
		local30.method21874();
		return local30;
	}
}
