package com.jagex;

import java.util.Collection;
import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!zm")
public class Class695 implements Iterable, Collection {

	@OriginalMember(owner = "client!zm", name = "dg", descriptor = "Lclient!client;")
	public static client aClient1;

	@OriginalMember(owner = "client!zm", name = "bn", descriptor = "Lclient!wy;")
	public static Class635 aClass635_1;

	@OriginalMember(owner = "client!zm", name = "w", descriptor = "[Lclient!en;")
	public static Class96[] aClass96Array1;

	@OriginalMember(owner = "client!zm", name = "c", descriptor = "Lclient!sn;")
	Class77 aClass77_224;

	@OriginalMember(owner = "client!zm", name = "p", descriptor = "Lclient!sn;")
	public Class77 aClass77_223 = new Class77();

	@OriginalMember(owner = "client!zm", name = "<init>", descriptor = "()V", line = 10)
	public Class695() {
		this.aClass77_223.aClass77_222 = this.aClass77_223;
		this.aClass77_223.aClass77_221 = this.aClass77_223;
	}

	@OriginalMember(owner = "client!zm", name = "ai", descriptor = "()V", line = 16)
	public void method36379() {
		while (this.aClass77_223.aClass77_222 != this.aClass77_223) {
			this.aClass77_223.aClass77_222.method24063();
		}
	}

	@OriginalMember(owner = "client!zm", name = "p", descriptor = "(I)V", line = 16)
	public void method36380() {
		while (this.aClass77_223.aClass77_222 != this.aClass77_223) {
			this.aClass77_223.aClass77_222.method24063();
		}
	}

	@OriginalMember(owner = "client!zm", name = "aj", descriptor = "()V", line = 16)
	public void method36381() {
		while (this.aClass77_223.aClass77_222 != this.aClass77_223) {
			this.aClass77_223.aClass77_222.method24063();
		}
	}

	@OriginalMember(owner = "client!zm", name = "ag", descriptor = "()V", line = 16)
	public void method36382() {
		while (this.aClass77_223.aClass77_222 != this.aClass77_223) {
			this.aClass77_223.aClass77_222.method24063();
		}
	}

	@OriginalMember(owner = "client!zm", name = "c", descriptor = "(Lclient!sn;S)V", line = 22)
	public void method36383(@OriginalArg(0) Class77 arg0) {
		if (arg0.aClass77_221 != null) {
			arg0.method24063();
		}
		arg0.aClass77_221 = this.aClass77_223.aClass77_221;
		arg0.aClass77_222 = this.aClass77_223;
		arg0.aClass77_221.aClass77_222 = arg0;
		arg0.aClass77_222.aClass77_221 = arg0;
	}

	@OriginalMember(owner = "client!zm", name = "al", descriptor = "(Lclient!sn;)V", line = 22)
	public void method36384(@OriginalArg(0) Class77 arg0) {
		if (arg0.aClass77_221 != null) {
			arg0.method24063();
		}
		arg0.aClass77_221 = this.aClass77_223.aClass77_221;
		arg0.aClass77_222 = this.aClass77_223;
		arg0.aClass77_221.aClass77_222 = arg0;
		arg0.aClass77_222.aClass77_221 = arg0;
	}

	@OriginalMember(owner = "client!zm", name = "ao", descriptor = "(Lclient!sn;)V", line = 22)
	public void method36385(@OriginalArg(0) Class77 arg0) {
		if (arg0.aClass77_221 != null) {
			arg0.method24063();
		}
		arg0.aClass77_221 = this.aClass77_223.aClass77_221;
		arg0.aClass77_222 = this.aClass77_223;
		arg0.aClass77_221.aClass77_222 = arg0;
		arg0.aClass77_222.aClass77_221 = arg0;
	}

	@OriginalMember(owner = "client!zm", name = "ak", descriptor = "(Lclient!sn;Lclient!sn;)V", line = 30)
	public static void method36386(@OriginalArg(0) Class77 arg0, @OriginalArg(1) Class77 arg1) {
		if (arg0.aClass77_221 != null) {
			arg0.method24063();
		}
		arg0.aClass77_221 = arg1.aClass77_221;
		arg0.aClass77_222 = arg1;
		arg0.aClass77_221.aClass77_222 = arg0;
		arg0.aClass77_222.aClass77_221 = arg0;
	}

	@OriginalMember(owner = "client!zm", name = "au", descriptor = "(Lclient!sn;Lclient!sn;)V", line = 30)
	public static void method36387(@OriginalArg(0) Class77 arg0, @OriginalArg(1) Class77 arg1) {
		if (arg0.aClass77_221 != null) {
			arg0.method24063();
		}
		arg0.aClass77_221 = arg1.aClass77_221;
		arg0.aClass77_222 = arg1;
		arg0.aClass77_221.aClass77_222 = arg0;
		arg0.aClass77_222.aClass77_221 = arg0;
	}

	@OriginalMember(owner = "client!zm", name = "l", descriptor = "(B)Lclient!sn;", line = 38)
	public Class77 method36388() {
		@Pc(3) Class77 local3 = this.aClass77_223.aClass77_222;
		if (this.aClass77_223 == local3) {
			return null;
		} else {
			local3.method24063();
			return local3;
		}
	}

	@OriginalMember(owner = "client!zm", name = "ax", descriptor = "()Lclient!sn;", line = 38)
	public Class77 method36389() {
		@Pc(3) Class77 local3 = this.aClass77_223.aClass77_222;
		if (this.aClass77_223 == local3) {
			return null;
		} else {
			local3.method24063();
			return local3;
		}
	}

	@OriginalMember(owner = "client!zm", name = "y", descriptor = "(Lclient!zm;Lclient!sn;B)V", line = 45)
	void method36390(@OriginalArg(0) Class695 arg0, @OriginalArg(1) Class77 arg1) {
		@Pc(3) Class77 local3 = this.aClass77_223.aClass77_221;
		this.aClass77_223.aClass77_221 = arg1.aClass77_221;
		arg1.aClass77_221.aClass77_222 = this.aClass77_223;
		if (arg1 != this.aClass77_223) {
			arg1.aClass77_221 = arg0.aClass77_223.aClass77_221;
			arg1.aClass77_221.aClass77_222 = arg1;
			local3.aClass77_222 = arg0.aClass77_223;
			arg0.aClass77_223.aClass77_221 = local3;
		}
	}

	@OriginalMember(owner = "client!zm", name = "ad", descriptor = "(Lclient!zm;Lclient!sn;)V", line = 45)
	void method36391(@OriginalArg(0) Class695 arg0, @OriginalArg(1) Class77 arg1) {
		@Pc(3) Class77 local3 = this.aClass77_223.aClass77_221;
		this.aClass77_223.aClass77_221 = arg1.aClass77_221;
		arg1.aClass77_221.aClass77_222 = this.aClass77_223;
		if (arg1 != this.aClass77_223) {
			arg1.aClass77_221 = arg0.aClass77_223.aClass77_221;
			arg1.aClass77_221.aClass77_222 = arg1;
			local3.aClass77_222 = arg0.aClass77_223;
			arg0.aClass77_223.aClass77_221 = local3;
		}
	}

	@OriginalMember(owner = "client!zm", name = "ar", descriptor = "(Lclient!zm;Lclient!sn;)V", line = 45)
	void method36392(@OriginalArg(0) Class695 arg0, @OriginalArg(1) Class77 arg1) {
		@Pc(3) Class77 local3 = this.aClass77_223.aClass77_221;
		this.aClass77_223.aClass77_221 = arg1.aClass77_221;
		arg1.aClass77_221.aClass77_222 = this.aClass77_223;
		if (arg1 != this.aClass77_223) {
			arg1.aClass77_221 = arg0.aClass77_223.aClass77_221;
			arg1.aClass77_221.aClass77_222 = arg1;
			local3.aClass77_222 = arg0.aClass77_223;
			arg0.aClass77_223.aClass77_221 = local3;
		}
	}

	@OriginalMember(owner = "client!zm", name = "w", descriptor = "(Lclient!zm;S)V", line = 57)
	public void method36393(@OriginalArg(0) Class695 arg0) {
		if (this.aClass77_223.aClass77_222 != this.aClass77_223) {
			this.method36390(arg0, this.aClass77_223.aClass77_222);
		}
	}

	@OriginalMember(owner = "client!zm", name = "ac", descriptor = "(Lclient!zm;)V", line = 57)
	public void method36394(@OriginalArg(0) Class695 arg0) {
		if (this.aClass77_223.aClass77_222 != this.aClass77_223) {
			this.method36390(arg0, this.aClass77_223.aClass77_222);
		}
	}

	@OriginalMember(owner = "client!zm", name = "t", descriptor = "(B)Lclient!sn;", line = 62)
	public Class77 method36395() {
		return this.method36397(null);
	}

	@OriginalMember(owner = "client!zm", name = "av", descriptor = "()Lclient!sn;", line = 62)
	public Class77 method36396() {
		return this.method36397(null);
	}

	@OriginalMember(owner = "client!zm", name = "q", descriptor = "(Lclient!sn;B)Lclient!sn;", line = 67)
	Class77 method36397(@OriginalArg(0) Class77 arg0) {
		@Pc(5) Class77 local5;
		if (arg0 == null) {
			local5 = this.aClass77_223.aClass77_222;
		} else {
			local5 = arg0;
		}
		if (local5 == this.aClass77_223) {
			this.aClass77_224 = null;
			return null;
		} else {
			this.aClass77_224 = local5.aClass77_222;
			return local5;
		}
	}

	@OriginalMember(owner = "client!zm", name = "ae", descriptor = "(Lclient!sn;)Lclient!sn;", line = 67)
	Class77 method36398(@OriginalArg(0) Class77 arg0) {
		@Pc(5) Class77 local5;
		if (arg0 == null) {
			local5 = this.aClass77_223.aClass77_222;
		} else {
			local5 = arg0;
		}
		if (local5 == this.aClass77_223) {
			this.aClass77_224 = null;
			return null;
		} else {
			this.aClass77_224 = local5.aClass77_222;
			return local5;
		}
	}

	@OriginalMember(owner = "client!zm", name = "at", descriptor = "(Lclient!sn;)Lclient!sn;", line = 67)
	Class77 method36399(@OriginalArg(0) Class77 arg0) {
		@Pc(5) Class77 local5;
		if (arg0 == null) {
			local5 = this.aClass77_223.aClass77_222;
		} else {
			local5 = arg0;
		}
		if (local5 == this.aClass77_223) {
			this.aClass77_224 = null;
			return null;
		} else {
			this.aClass77_224 = local5.aClass77_222;
			return local5;
		}
	}

	@OriginalMember(owner = "client!zm", name = "x", descriptor = "(B)Lclient!sn;", line = 78)
	public Class77 method36400() {
		return this.method36403(null);
	}

	@OriginalMember(owner = "client!zm", name = "as", descriptor = "()Lclient!sn;", line = 78)
	public Class77 method36401() {
		return this.method36403(null);
	}

	@OriginalMember(owner = "client!zm", name = "ah", descriptor = "()Lclient!sn;", line = 78)
	public Class77 method36402() {
		return this.method36403(null);
	}

	@OriginalMember(owner = "client!zm", name = "d", descriptor = "(Lclient!sn;I)Lclient!sn;", line = 83)
	Class77 method36403(@OriginalArg(0) Class77 arg0) {
		@Pc(6) Class77 local6;
		if (arg0 == null) {
			local6 = this.aClass77_223.aClass77_221;
		} else {
			local6 = arg0;
		}
		if (this.aClass77_223 == local6) {
			this.aClass77_224 = null;
			return null;
		} else {
			this.aClass77_224 = local6.aClass77_221;
			return local6;
		}
	}

	@OriginalMember(owner = "client!zm", name = "am", descriptor = "(Lclient!sn;)Lclient!sn;", line = 83)
	Class77 method36404(@OriginalArg(0) Class77 arg0) {
		@Pc(6) Class77 local6;
		if (arg0 == null) {
			local6 = this.aClass77_223.aClass77_221;
		} else {
			local6 = arg0;
		}
		if (this.aClass77_223 == local6) {
			this.aClass77_224 = null;
			return null;
		} else {
			this.aClass77_224 = local6.aClass77_221;
			return local6;
		}
	}

	@OriginalMember(owner = "client!zm", name = "aq", descriptor = "(Lclient!sn;)Lclient!sn;", line = 83)
	Class77 method36405(@OriginalArg(0) Class77 arg0) {
		@Pc(6) Class77 local6;
		if (arg0 == null) {
			local6 = this.aClass77_223.aClass77_221;
		} else {
			local6 = arg0;
		}
		if (this.aClass77_223 == local6) {
			this.aClass77_224 = null;
			return null;
		} else {
			this.aClass77_224 = local6.aClass77_221;
			return local6;
		}
	}

	@OriginalMember(owner = "client!zm", name = "g", descriptor = "(I)Lclient!sn;", line = 94)
	public Class77 method36406() {
		@Pc(2) Class77 local2 = this.aClass77_224;
		if (local2 == this.aClass77_223) {
			this.aClass77_224 = null;
			return null;
		} else {
			this.aClass77_224 = local2.aClass77_222;
			return local2;
		}
	}

	@OriginalMember(owner = "client!zm", name = "an", descriptor = "()Lclient!sn;", line = 94)
	public Class77 method36407() {
		@Pc(2) Class77 local2 = this.aClass77_224;
		if (local2 == this.aClass77_223) {
			this.aClass77_224 = null;
			return null;
		} else {
			this.aClass77_224 = local2.aClass77_222;
			return local2;
		}
	}

	@OriginalMember(owner = "client!zm", name = "ay", descriptor = "()Lclient!sn;", line = 94)
	public Class77 method36408() {
		@Pc(2) Class77 local2 = this.aClass77_224;
		if (local2 == this.aClass77_223) {
			this.aClass77_224 = null;
			return null;
		} else {
			this.aClass77_224 = local2.aClass77_222;
			return local2;
		}
	}

	@OriginalMember(owner = "client!zm", name = "af", descriptor = "()Lclient!sn;", line = 94)
	public Class77 method36409() {
		@Pc(2) Class77 local2 = this.aClass77_224;
		if (local2 == this.aClass77_223) {
			this.aClass77_224 = null;
			return null;
		} else {
			this.aClass77_224 = local2.aClass77_222;
			return local2;
		}
	}

	@OriginalMember(owner = "client!zm", name = "z", descriptor = "(B)Lclient!sn;", line = 104)
	public Class77 method36410() {
		@Pc(2) Class77 local2 = this.aClass77_224;
		if (local2 == this.aClass77_223) {
			this.aClass77_224 = null;
			return null;
		} else {
			this.aClass77_224 = local2.aClass77_221;
			return local2;
		}
	}

	@OriginalMember(owner = "client!zm", name = "aa", descriptor = "()Lclient!sn;", line = 104)
	public Class77 method36411() {
		@Pc(2) Class77 local2 = this.aClass77_224;
		if (local2 == this.aClass77_223) {
			this.aClass77_224 = null;
			return null;
		} else {
			this.aClass77_224 = local2.aClass77_221;
			return local2;
		}
	}

	@OriginalMember(owner = "client!zm", name = "ab", descriptor = "()Lclient!sn;", line = 104)
	public Class77 method36412() {
		@Pc(2) Class77 local2 = this.aClass77_224;
		if (local2 == this.aClass77_223) {
			this.aClass77_224 = null;
			return null;
		} else {
			this.aClass77_224 = local2.aClass77_221;
			return local2;
		}
	}

	@OriginalMember(owner = "client!zm", name = "j", descriptor = "(B)I", line = 114)
	public int method36413() {
		@Pc(1) int local1 = 0;
		for (@Pc(5) Class77 local5 = this.aClass77_223.aClass77_222; local5 != this.aClass77_223; local5 = local5.aClass77_222) {
			local1++;
		}
		return local1;
	}

	@OriginalMember(owner = "client!zm", name = "ap", descriptor = "()I", line = 114)
	public int method36414() {
		@Pc(1) int local1 = 0;
		for (@Pc(5) Class77 local5 = this.aClass77_223.aClass77_222; local5 != this.aClass77_223; local5 = local5.aClass77_222) {
			local1++;
		}
		return local1;
	}

	@OriginalMember(owner = "client!zm", name = "aw", descriptor = "()I", line = 114)
	public int method36415() {
		@Pc(1) int local1 = 0;
		for (@Pc(5) Class77 local5 = this.aClass77_223.aClass77_222; local5 != this.aClass77_223; local5 = local5.aClass77_222) {
			local1++;
		}
		return local1;
	}

	@OriginalMember(owner = "client!zm", name = "i", descriptor = "(I)Z", line = 124)
	public boolean method36416() {
		return this.aClass77_223 == this.aClass77_223.aClass77_222;
	}

	@OriginalMember(owner = "client!zm", name = "az", descriptor = "()Z", line = 124)
	public boolean method36417() {
		return this.aClass77_223 == this.aClass77_223.aClass77_222;
	}

	@OriginalMember(owner = "client!zm", name = "bc", descriptor = "()Z", line = 124)
	public boolean method36418() {
		return this.aClass77_223 == this.aClass77_223.aClass77_222;
	}

	@OriginalMember(owner = "client!zm", name = "bv", descriptor = "()[Lclient!sn;", line = 128)
	Class77[] method36419() {
		@Pc(4) Class77[] local4 = new Class77[this.method36413()];
		@Pc(6) int local6 = 0;
		for (@Pc(10) Class77 local10 = this.aClass77_223.aClass77_222; local10 != this.aClass77_223; local10 = local10.aClass77_222) {
			local4[local6++] = local10;
		}
		return local4;
	}

	@OriginalMember(owner = "client!zm", name = "bb", descriptor = "()[Lclient!sn;", line = 128)
	Class77[] method36420() {
		@Pc(4) Class77[] local4 = new Class77[this.method36413()];
		@Pc(6) int local6 = 0;
		for (@Pc(10) Class77 local10 = this.aClass77_223.aClass77_222; local10 != this.aClass77_223; local10 = local10.aClass77_222) {
			local4[local6++] = local10;
		}
		return local4;
	}

	@OriginalMember(owner = "client!zm", name = "bj", descriptor = "()[Lclient!sn;", line = 128)
	Class77[] method36421() {
		@Pc(4) Class77[] local4 = new Class77[this.method36413()];
		@Pc(6) int local6 = 0;
		for (@Pc(10) Class77 local10 = this.aClass77_223.aClass77_222; local10 != this.aClass77_223; local10 = local10.aClass77_222) {
			local4[local6++] = local10;
		}
		return local4;
	}

	@OriginalMember(owner = "client!zm", name = "ba", descriptor = "()[Lclient!sn;", line = 128)
	Class77[] method36422() {
		@Pc(4) Class77[] local4 = new Class77[this.method36413()];
		@Pc(6) int local6 = 0;
		for (@Pc(10) Class77 local10 = this.aClass77_223.aClass77_222; local10 != this.aClass77_223; local10 = local10.aClass77_222) {
			local4[local6++] = local10;
		}
		return local4;
	}

	@OriginalMember(owner = "client!zm", name = "bl", descriptor = "()[Lclient!sn;", line = 128)
	Class77[] method36423() {
		@Pc(4) Class77[] local4 = new Class77[this.method36413()];
		@Pc(6) int local6 = 0;
		for (@Pc(10) Class77 local10 = this.aClass77_223.aClass77_222; local10 != this.aClass77_223; local10 = local10.aClass77_222) {
			local4[local6++] = local10;
		}
		return local4;
	}

	@OriginalMember(owner = "client!zm", name = "k", descriptor = "(I)[Lclient!sn;", line = 128)
	Class77[] method36424() {
		@Pc(4) Class77[] local4 = new Class77[this.method36413()];
		@Pc(6) int local6 = 0;
		for (@Pc(10) Class77 local10 = this.aClass77_223.aClass77_222; local10 != this.aClass77_223; local10 = local10.aClass77_222) {
			local4[local6++] = local10;
		}
		return local4;
	}

	@OriginalMember(owner = "client!zm", name = "iterator", descriptor = "()Ljava/util/Iterator;", line = 139)
	@Override
	public Iterator iterator() {
		return new Class704(this);
	}

	@OriginalMember(owner = "client!zm", name = "s", descriptor = "()Ljava/util/Iterator;", line = 139)
	public Iterator method36425() {
		return new Class704(this);
	}

	@OriginalMember(owner = "client!zm", name = "r", descriptor = "()Ljava/util/Iterator;", line = 139)
	public Iterator method36426() {
		return new Class704(this);
	}

	@OriginalMember(owner = "client!zm", name = "e", descriptor = "()I", line = 143)
	public int method36427() {
		return this.method36413();
	}

	@OriginalMember(owner = "client!zm", name = "f", descriptor = "()I", line = 143)
	public int method36428() {
		return this.method36413();
	}

	@OriginalMember(owner = "client!zm", name = "size", descriptor = "()I", line = 143)
	@Override
	public int size() {
		return this.method36413();
	}

	@OriginalMember(owner = "client!zm", name = "isEmpty", descriptor = "()Z", line = 147)
	@Override
	public boolean isEmpty() {
		return this.method36416();
	}

	@OriginalMember(owner = "client!zm", name = "bd", descriptor = "()Z", line = 147)
	public boolean method36429() {
		return this.method36416();
	}

	@OriginalMember(owner = "client!zm", name = "contains", descriptor = "(Ljava/lang/Object;)Z", line = 151)
	@Override
	public boolean contains(@OriginalArg(0) Object arg0) {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!zm", name = "a", descriptor = "(Ljava/lang/Object;)Z", line = 151)
	public boolean method36430(@OriginalArg(0) Object arg0) {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!zm", name = "m", descriptor = "(Ljava/lang/Object;)Z", line = 151)
	public boolean method36431(@OriginalArg(0) Object arg0) {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!zm", name = "toArray", descriptor = "()[Ljava/lang/Object;", line = 155)
	@Override
	public Object[] toArray() {
		return this.method36424();
	}

	@OriginalMember(owner = "client!zm", name = "h", descriptor = "()[Ljava/lang/Object;", line = 155)
	public Object[] method36432() {
		return this.method36424();
	}

	@OriginalMember(owner = "client!zm", name = "bx", descriptor = "([Ljava/lang/Object;)[Ljava/lang/Object;", line = 159)
	public Object[] method36433(@OriginalArg(0) Object[] arg0) {
		@Pc(1) int local1 = 0;
		for (@Pc(5) Class77 local5 = this.aClass77_223.aClass77_222; local5 != this.aClass77_223; local5 = local5.aClass77_222) {
			arg0[local1++] = local5;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!zm", name = "toArray", descriptor = "([Ljava/lang/Object;)[Ljava/lang/Object;", line = 159)
	@Override
	public Object[] toArray(@OriginalArg(0) Object[] arg0) {
		@Pc(1) int local1 = 0;
		for (@Pc(5) Class77 local5 = this.aClass77_223.aClass77_222; local5 != this.aClass77_223; local5 = local5.aClass77_222) {
			arg0[local1++] = local5;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!zm", name = "by", descriptor = "([Ljava/lang/Object;)[Ljava/lang/Object;", line = 159)
	public Object[] method36434(@OriginalArg(0) Object[] arg0) {
		@Pc(1) int local1 = 0;
		for (@Pc(5) Class77 local5 = this.aClass77_223.aClass77_222; local5 != this.aClass77_223; local5 = local5.aClass77_222) {
			arg0[local1++] = local5;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!zm", name = "bw", descriptor = "([Ljava/lang/Object;)[Ljava/lang/Object;", line = 159)
	public Object[] method36435(@OriginalArg(0) Object[] arg0) {
		@Pc(1) int local1 = 0;
		for (@Pc(5) Class77 local5 = this.aClass77_223.aClass77_222; local5 != this.aClass77_223; local5 = local5.aClass77_222) {
			arg0[local1++] = local5;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!zm", name = "u", descriptor = "(Lclient!sn;I)Z", line = 169)
	boolean method36436(@OriginalArg(0) Class77 arg0) {
		this.method36383(arg0);
		return true;
	}

	@OriginalMember(owner = "client!zm", name = "remove", descriptor = "(Ljava/lang/Object;)Z", line = 174)
	@Override
	public boolean remove(@OriginalArg(0) Object arg0) {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!zm", name = "o", descriptor = "(Ljava/lang/Object;)Z", line = 174)
	public boolean method36437(@OriginalArg(0) Object arg0) {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!zm", name = "b", descriptor = "(Ljava/lang/Object;)Z", line = 174)
	public boolean method36438(@OriginalArg(0) Object arg0) {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!zm", name = "n", descriptor = "(Ljava/lang/Object;)Z", line = 174)
	public boolean method36439(@OriginalArg(0) Object arg0) {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!zm", name = "containsAll", descriptor = "(Ljava/util/Collection;)Z", line = 178)
	@Override
	public boolean containsAll(@OriginalArg(0) Collection arg0) {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!zm", name = "bi", descriptor = "(Ljava/util/Collection;)Z", line = 178)
	public boolean method36440(@OriginalArg(0) Collection arg0) {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!zm", name = "bg", descriptor = "(Ljava/util/Collection;)Z", line = 178)
	public boolean method36441(@OriginalArg(0) Collection arg0) {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!zm", name = "addAll", descriptor = "(Ljava/util/Collection;)Z", line = 182)
	@Override
	public boolean addAll(@OriginalArg(0) Collection arg0) {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!zm", name = "removeAll", descriptor = "(Ljava/util/Collection;)Z", line = 186)
	@Override
	public boolean removeAll(@OriginalArg(0) Collection arg0) {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!zm", name = "retainAll", descriptor = "(Ljava/util/Collection;)Z", line = 190)
	@Override
	public boolean retainAll(@OriginalArg(0) Collection arg0) {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!zm", name = "bs", descriptor = "(Ljava/util/Collection;)Z", line = 190)
	public boolean method36442(@OriginalArg(0) Collection arg0) {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!zm", name = "clear", descriptor = "()V", line = 194)
	@Override
	public void clear() {
		this.method36380();
	}

	@OriginalMember(owner = "client!zm", name = "bt", descriptor = "()V", line = 194)
	public void method36443() {
		this.method36380();
	}

	@OriginalMember(owner = "client!zm", name = "bz", descriptor = "(Ljava/lang/Object;)Z", line = 198)
	public boolean method36444(@OriginalArg(0) Object arg0) {
		return this.method36436((Class77) arg0);
	}

	@OriginalMember(owner = "client!zm", name = "add", descriptor = "(Ljava/lang/Object;)Z", line = 198)
	@Override
	public boolean add(@OriginalArg(0) Object arg0) {
		return this.method36436((Class77) arg0);
	}

	@OriginalMember(owner = "client!zm", name = "hn", descriptor = "(Ljava/lang/Object;)Z", line = 202)
	public boolean method36445(@OriginalArg(0) Object arg0) {
		return super.equals(arg0);
	}

	@OriginalMember(owner = "client!zm", name = "equals", descriptor = "(Ljava/lang/Object;)Z", line = 202)
	@Override
	public boolean equals(@OriginalArg(0) Object arg0) {
		return super.equals(arg0);
	}

	@OriginalMember(owner = "client!zm", name = "hi", descriptor = "(Ljava/lang/Object;)Z", line = 202)
	public boolean method36446(@OriginalArg(0) Object arg0) {
		return super.equals(arg0);
	}

	@OriginalMember(owner = "client!zm", name = "hf", descriptor = "(Ljava/lang/Object;)Z", line = 202)
	public boolean method36447(@OriginalArg(0) Object arg0) {
		return super.equals(arg0);
	}

	@OriginalMember(owner = "client!zm", name = "ha", descriptor = "(Ljava/lang/Object;)Z", line = 202)
	public boolean method36448(@OriginalArg(0) Object arg0) {
		return super.equals(arg0);
	}

	@OriginalMember(owner = "client!zm", name = "hashCode", descriptor = "()I", line = 206)
	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@OriginalMember(owner = "client!zm", name = "rr", descriptor = "()I", line = 206)
	public int method36449() {
		return super.hashCode();
	}

	@OriginalMember(owner = "client!zm", name = "ur", descriptor = "(Lclient!yf;I)V", line = 8232)
	static final void method36450(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 1544997815;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		@Pc(33) int local33 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 2];
		@Pc(43) int local43 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 3];
		@Pc(53) int local53 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 4];
		Class94_Sub4.aClass261_1.method26335(Class239.aClass239_9, local13, local23, local43, Class220.aClass220_8.method25727(), Class235.aClass235_2, 0.0F, 0.0F, null, 0, local53, local33);
	}

	@OriginalMember(owner = "client!zm", name = "ze", descriptor = "(Lclient!yf;B)V", line = 9193)
	static final void method36451(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = (int) (client.aClass243_1.method26040() / 60000L);
	}
}
