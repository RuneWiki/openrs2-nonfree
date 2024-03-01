package com.jagex;

import java.util.Collection;
import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aat")
public class Class22 implements Iterable, Collection {

	@OriginalMember(owner = "client!aat", name = "n", descriptor = "Lclient!tj;")
	Class93 aClass93_7;

	@OriginalMember(owner = "client!aat", name = "e", descriptor = "Lclient!tj;")
	public Class93 aClass93_8 = new Class93();

	@OriginalMember(owner = "client!aat", name = "<init>", descriptor = "()V", line = 10)
	public Class22() {
		this.aClass93_8.aClass93_227 = this.aClass93_8;
		this.aClass93_8.aClass93_228 = this.aClass93_8;
	}

	@OriginalMember(owner = "client!aat", name = "e", descriptor = "(I)V", line = 16)
	public void method406() {
		while (this.aClass93_8.aClass93_227 != this.aClass93_8) {
			this.aClass93_8.aClass93_227.method23969();
		}
	}

	@OriginalMember(owner = "client!aat", name = "t", descriptor = "()V", line = 16)
	public void method440() {
		while (this.aClass93_8.aClass93_227 != this.aClass93_8) {
			this.aClass93_8.aClass93_227.method23969();
		}
	}

	@OriginalMember(owner = "client!aat", name = "j", descriptor = "()V", line = 16)
	public void method489() {
		while (this.aClass93_8.aClass93_227 != this.aClass93_8) {
			this.aClass93_8.aClass93_227.method23969();
		}
	}

	@OriginalMember(owner = "client!aat", name = "n", descriptor = "(Lclient!tj;I)V", line = 22)
	public void method407(@OriginalArg(0) Class93 arg0) {
		if (arg0.aClass93_228 != null) {
			arg0.method23969();
		}
		arg0.aClass93_228 = this.aClass93_8.aClass93_228;
		arg0.aClass93_227 = this.aClass93_8;
		arg0.aClass93_228.aClass93_227 = arg0;
		arg0.aClass93_227.aClass93_228 = arg0;
	}

	@OriginalMember(owner = "client!aat", name = "ae", descriptor = "(Lclient!tj;)V", line = 22)
	public void method410(@OriginalArg(0) Class93 arg0) {
		if (arg0.aClass93_228 != null) {
			arg0.method23969();
		}
		arg0.aClass93_228 = this.aClass93_8.aClass93_228;
		arg0.aClass93_227 = this.aClass93_8;
		arg0.aClass93_228.aClass93_227 = arg0;
		arg0.aClass93_227.aClass93_228 = arg0;
	}

	@OriginalMember(owner = "client!aat", name = "ah", descriptor = "(Lclient!tj;)V", line = 22)
	public void method425(@OriginalArg(0) Class93 arg0) {
		if (arg0.aClass93_228 != null) {
			arg0.method23969();
		}
		arg0.aClass93_228 = this.aClass93_8.aClass93_228;
		arg0.aClass93_227 = this.aClass93_8;
		arg0.aClass93_228.aClass93_227 = arg0;
		arg0.aClass93_227.aClass93_228 = arg0;
	}

	@OriginalMember(owner = "client!aat", name = "ag", descriptor = "(Lclient!tj;)V", line = 22)
	public void method442(@OriginalArg(0) Class93 arg0) {
		if (arg0.aClass93_228 != null) {
			arg0.method23969();
		}
		arg0.aClass93_228 = this.aClass93_8.aClass93_228;
		arg0.aClass93_227 = this.aClass93_8;
		arg0.aClass93_228.aClass93_227 = arg0;
		arg0.aClass93_227.aClass93_228 = arg0;
	}

	@OriginalMember(owner = "client!aat", name = "ac", descriptor = "(Lclient!tj;Lclient!tj;)V", line = 30)
	public static void method433(@OriginalArg(0) Class93 arg0, @OriginalArg(1) Class93 arg1) {
		if (arg0.aClass93_228 != null) {
			arg0.method23969();
		}
		arg0.aClass93_228 = arg1.aClass93_228;
		arg0.aClass93_227 = arg1;
		arg0.aClass93_228.aClass93_227 = arg0;
		arg0.aClass93_227.aClass93_228 = arg0;
	}

	@OriginalMember(owner = "client!aat", name = "ai", descriptor = "(Lclient!tj;Lclient!tj;)V", line = 30)
	public static void method469(@OriginalArg(0) Class93 arg0, @OriginalArg(1) Class93 arg1) {
		if (arg0.aClass93_228 != null) {
			arg0.method23969();
		}
		arg0.aClass93_228 = arg1.aClass93_228;
		arg0.aClass93_227 = arg1;
		arg0.aClass93_228.aClass93_227 = arg0;
		arg0.aClass93_227.aClass93_228 = arg0;
	}

	@OriginalMember(owner = "client!aat", name = "al", descriptor = "(Lclient!tj;Lclient!tj;)V", line = 30)
	public static void method473(@OriginalArg(0) Class93 arg0, @OriginalArg(1) Class93 arg1) {
		if (arg0.aClass93_228 != null) {
			arg0.method23969();
		}
		arg0.aClass93_228 = arg1.aClass93_228;
		arg0.aClass93_227 = arg1;
		arg0.aClass93_228.aClass93_227 = arg0;
		arg0.aClass93_227.aClass93_228 = arg0;
	}

	@OriginalMember(owner = "client!aat", name = "k", descriptor = "(I)Lclient!tj;", line = 38)
	public Class93 method408() {
		@Pc(3) Class93 local3 = this.aClass93_8.aClass93_227;
		if (this.aClass93_8 == local3) {
			return null;
		} else {
			local3.method23969();
			return local3;
		}
	}

	@OriginalMember(owner = "client!aat", name = "aw", descriptor = "()Lclient!tj;", line = 38)
	public Class93 method460() {
		@Pc(3) Class93 local3 = this.aClass93_8.aClass93_227;
		if (this.aClass93_8 == local3) {
			return null;
		} else {
			local3.method23969();
			return local3;
		}
	}

	@OriginalMember(owner = "client!aat", name = "f", descriptor = "(Lclient!aat;Lclient!tj;I)V", line = 45)
	void method409(@OriginalArg(0) Class22 arg0, @OriginalArg(1) Class93 arg1) {
		@Pc(3) Class93 local3 = this.aClass93_8.aClass93_228;
		this.aClass93_8.aClass93_228 = arg1.aClass93_228;
		arg1.aClass93_228.aClass93_227 = this.aClass93_8;
		if (this.aClass93_8 != arg1) {
			arg1.aClass93_228 = arg0.aClass93_8.aClass93_228;
			arg1.aClass93_228.aClass93_227 = arg1;
			local3.aClass93_227 = arg0.aClass93_8;
			arg0.aClass93_8.aClass93_228 = local3;
		}
	}

	@OriginalMember(owner = "client!aat", name = "at", descriptor = "(Lclient!aat;Lclient!tj;)V", line = 45)
	void method417(@OriginalArg(0) Class22 arg0, @OriginalArg(1) Class93 arg1) {
		@Pc(3) Class93 local3 = this.aClass93_8.aClass93_228;
		this.aClass93_8.aClass93_228 = arg1.aClass93_228;
		arg1.aClass93_228.aClass93_227 = this.aClass93_8;
		if (this.aClass93_8 != arg1) {
			arg1.aClass93_228 = arg0.aClass93_8.aClass93_228;
			arg1.aClass93_228.aClass93_227 = arg1;
			local3.aClass93_227 = arg0.aClass93_8;
			arg0.aClass93_8.aClass93_228 = local3;
		}
	}

	@OriginalMember(owner = "client!aat", name = "as", descriptor = "(Lclient!aat;Lclient!tj;)V", line = 45)
	void method447(@OriginalArg(0) Class22 arg0, @OriginalArg(1) Class93 arg1) {
		@Pc(3) Class93 local3 = this.aClass93_8.aClass93_228;
		this.aClass93_8.aClass93_228 = arg1.aClass93_228;
		arg1.aClass93_228.aClass93_227 = this.aClass93_8;
		if (this.aClass93_8 != arg1) {
			arg1.aClass93_228 = arg0.aClass93_8.aClass93_228;
			arg1.aClass93_228.aClass93_227 = arg1;
			local3.aClass93_227 = arg0.aClass93_8;
			arg0.aClass93_8.aClass93_228 = local3;
		}
	}

	@OriginalMember(owner = "client!aat", name = "ad", descriptor = "(Lclient!aat;Lclient!tj;)V", line = 45)
	void method449(@OriginalArg(0) Class22 arg0, @OriginalArg(1) Class93 arg1) {
		@Pc(3) Class93 local3 = this.aClass93_8.aClass93_228;
		this.aClass93_8.aClass93_228 = arg1.aClass93_228;
		arg1.aClass93_228.aClass93_227 = this.aClass93_8;
		if (this.aClass93_8 != arg1) {
			arg1.aClass93_228 = arg0.aClass93_8.aClass93_228;
			arg1.aClass93_228.aClass93_227 = arg1;
			local3.aClass93_227 = arg0.aClass93_8;
			arg0.aClass93_8.aClass93_228 = local3;
		}
	}

	@OriginalMember(owner = "client!aat", name = "f", descriptor = "(II)Z", line = 52)
	static boolean method492(@OriginalArg(0) int arg0) {
		return arg0 >= Class615.aClass615_7.anInt5628 * 948246811 && arg0 <= Class615.aClass615_2.anInt5628 * 948246811;
	}

	@OriginalMember(owner = "client!aat", name = "am", descriptor = "(Lclient!aat;)V", line = 57)
	public void method450(@OriginalArg(0) Class22 arg0) {
		if (this.aClass93_8.aClass93_227 != this.aClass93_8) {
			this.method409(arg0, this.aClass93_8.aClass93_227);
		}
	}

	@OriginalMember(owner = "client!aat", name = "au", descriptor = "(Lclient!aat;)V", line = 57)
	public void method451(@OriginalArg(0) Class22 arg0) {
		if (this.aClass93_8.aClass93_227 != this.aClass93_8) {
			this.method409(arg0, this.aClass93_8.aClass93_227);
		}
	}

	@OriginalMember(owner = "client!aat", name = "ar", descriptor = "(Lclient!aat;)V", line = 57)
	public void method452(@OriginalArg(0) Class22 arg0) {
		if (this.aClass93_8.aClass93_227 != this.aClass93_8) {
			this.method409(arg0, this.aClass93_8.aClass93_227);
		}
	}

	@OriginalMember(owner = "client!aat", name = "ap", descriptor = "(Lclient!aat;)V", line = 57)
	public void method453(@OriginalArg(0) Class22 arg0) {
		if (this.aClass93_8.aClass93_227 != this.aClass93_8) {
			this.method409(arg0, this.aClass93_8.aClass93_227);
		}
	}

	@OriginalMember(owner = "client!aat", name = "aq", descriptor = "(Lclient!aat;)V", line = 57)
	public void method454(@OriginalArg(0) Class22 arg0) {
		if (this.aClass93_8.aClass93_227 != this.aClass93_8) {
			this.method409(arg0, this.aClass93_8.aClass93_227);
		}
	}

	@OriginalMember(owner = "client!aat", name = "w", descriptor = "(Lclient!aat;I)V", line = 57)
	public void method461(@OriginalArg(0) Class22 arg0) {
		if (this.aClass93_8.aClass93_227 != this.aClass93_8) {
			this.method409(arg0, this.aClass93_8.aClass93_227);
		}
	}

	@OriginalMember(owner = "client!aat", name = "l", descriptor = "(B)Lclient!tj;", line = 62)
	public Class93 method445() {
		return this.method412(null);
	}

	@OriginalMember(owner = "client!aat", name = "ax", descriptor = "()Lclient!tj;", line = 62)
	public Class93 method455() {
		return this.method412(null);
	}

	@OriginalMember(owner = "client!aat", name = "av", descriptor = "()Lclient!tj;", line = 62)
	public Class93 method456() {
		return this.method412(null);
	}

	@OriginalMember(owner = "client!aat", name = "ao", descriptor = "()Lclient!tj;", line = 62)
	public Class93 method457() {
		return this.method412(null);
	}

	@OriginalMember(owner = "client!aat", name = "aj", descriptor = "()Lclient!tj;", line = 62)
	public Class93 method458() {
		return this.method412(null);
	}

	@OriginalMember(owner = "client!aat", name = "az", descriptor = "(Lclient!tj;)Lclient!tj;", line = 67)
	Class93 method405(@OriginalArg(0) Class93 arg0) {
		@Pc(5) Class93 local5;
		if (arg0 == null) {
			local5 = this.aClass93_8.aClass93_227;
		} else {
			local5 = arg0;
		}
		if (this.aClass93_8 == local5) {
			this.aClass93_7 = null;
			return null;
		} else {
			this.aClass93_7 = local5.aClass93_227;
			return local5;
		}
	}

	@OriginalMember(owner = "client!aat", name = "u", descriptor = "(Lclient!tj;B)Lclient!tj;", line = 67)
	Class93 method412(@OriginalArg(0) Class93 arg0) {
		@Pc(5) Class93 local5;
		if (arg0 == null) {
			local5 = this.aClass93_8.aClass93_227;
		} else {
			local5 = arg0;
		}
		if (this.aClass93_8 == local5) {
			this.aClass93_7 = null;
			return null;
		} else {
			this.aClass93_7 = local5.aClass93_227;
			return local5;
		}
	}

	@OriginalMember(owner = "client!aat", name = "ab", descriptor = "(Lclient!tj;)Lclient!tj;", line = 67)
	Class93 method416(@OriginalArg(0) Class93 arg0) {
		@Pc(5) Class93 local5;
		if (arg0 == null) {
			local5 = this.aClass93_8.aClass93_227;
		} else {
			local5 = arg0;
		}
		if (this.aClass93_8 == local5) {
			this.aClass93_7 = null;
			return null;
		} else {
			this.aClass93_7 = local5.aClass93_227;
			return local5;
		}
	}

	@OriginalMember(owner = "client!aat", name = "ay", descriptor = "(Lclient!tj;)Lclient!tj;", line = 67)
	Class93 method459(@OriginalArg(0) Class93 arg0) {
		@Pc(5) Class93 local5;
		if (arg0 == null) {
			local5 = this.aClass93_8.aClass93_227;
		} else {
			local5 = arg0;
		}
		if (this.aClass93_8 == local5) {
			this.aClass93_7 = null;
			return null;
		} else {
			this.aClass93_7 = local5.aClass93_227;
			return local5;
		}
	}

	@OriginalMember(owner = "client!aat", name = "z", descriptor = "(I)Lclient!tj;", line = 78)
	public Class93 method413() {
		return this.method443(null);
	}

	@OriginalMember(owner = "client!aat", name = "af", descriptor = "()Lclient!tj;", line = 78)
	public Class93 method463() {
		return this.method443(null);
	}

	@OriginalMember(owner = "client!aat", name = "aa", descriptor = "()Lclient!tj;", line = 78)
	public Class93 method464() {
		return this.method443(null);
	}

	@OriginalMember(owner = "client!aat", name = "r", descriptor = "(Lclient!tj;I)Lclient!tj;", line = 83)
	Class93 method443(@OriginalArg(0) Class93 arg0) {
		@Pc(5) Class93 local5;
		if (arg0 == null) {
			local5 = this.aClass93_8.aClass93_228;
		} else {
			local5 = arg0;
		}
		if (this.aClass93_8 == local5) {
			this.aClass93_7 = null;
			return null;
		} else {
			this.aClass93_7 = local5.aClass93_228;
			return local5;
		}
	}

	@OriginalMember(owner = "client!aat", name = "ak", descriptor = "(Lclient!tj;)Lclient!tj;", line = 83)
	Class93 method446(@OriginalArg(0) Class93 arg0) {
		@Pc(5) Class93 local5;
		if (arg0 == null) {
			local5 = this.aClass93_8.aClass93_228;
		} else {
			local5 = arg0;
		}
		if (this.aClass93_8 == local5) {
			this.aClass93_7 = null;
			return null;
		} else {
			this.aClass93_7 = local5.aClass93_228;
			return local5;
		}
	}

	@OriginalMember(owner = "client!aat", name = "v", descriptor = "(I)Lclient!tj;", line = 94)
	public Class93 method415() {
		@Pc(2) Class93 local2 = this.aClass93_7;
		if (local2 == this.aClass93_8) {
			this.aClass93_7 = null;
			return null;
		} else {
			this.aClass93_7 = local2.aClass93_227;
			return local2;
		}
	}

	@OriginalMember(owner = "client!aat", name = "an", descriptor = "()Lclient!tj;", line = 94)
	public Class93 method465() {
		@Pc(2) Class93 local2 = this.aClass93_7;
		if (local2 == this.aClass93_8) {
			this.aClass93_7 = null;
			return null;
		} else {
			this.aClass93_7 = local2.aClass93_227;
			return local2;
		}
	}

	@OriginalMember(owner = "client!aat", name = "o", descriptor = "(I)Lclient!tj;", line = 104)
	public Class93 method424() {
		@Pc(2) Class93 local2 = this.aClass93_7;
		if (local2 == this.aClass93_8) {
			this.aClass93_7 = null;
			return null;
		} else {
			this.aClass93_7 = local2.aClass93_228;
			return local2;
		}
	}

	@OriginalMember(owner = "client!aat", name = "bf", descriptor = "()Lclient!tj;", line = 104)
	public Class93 method466() {
		@Pc(2) Class93 local2 = this.aClass93_7;
		if (local2 == this.aClass93_8) {
			this.aClass93_7 = null;
			return null;
		} else {
			this.aClass93_7 = local2.aClass93_228;
			return local2;
		}
	}

	@OriginalMember(owner = "client!aat", name = "bl", descriptor = "()Lclient!tj;", line = 104)
	public Class93 method467() {
		@Pc(2) Class93 local2 = this.aClass93_7;
		if (local2 == this.aClass93_8) {
			this.aClass93_7 = null;
			return null;
		} else {
			this.aClass93_7 = local2.aClass93_228;
			return local2;
		}
	}

	@OriginalMember(owner = "client!aat", name = "bk", descriptor = "()Lclient!tj;", line = 104)
	public Class93 method477() {
		@Pc(2) Class93 local2 = this.aClass93_7;
		if (local2 == this.aClass93_8) {
			this.aClass93_7 = null;
			return null;
		} else {
			this.aClass93_7 = local2.aClass93_228;
			return local2;
		}
	}

	@OriginalMember(owner = "client!aat", name = "s", descriptor = "(I)I", line = 114)
	public int method411() {
		@Pc(1) int local1 = 0;
		for (@Pc(5) Class93 local5 = this.aClass93_8.aClass93_227; local5 != this.aClass93_8; local5 = local5.aClass93_227) {
			local1++;
		}
		return local1;
	}

	@OriginalMember(owner = "client!aat", name = "bx", descriptor = "()I", line = 114)
	public int method428() {
		@Pc(1) int local1 = 0;
		for (@Pc(5) Class93 local5 = this.aClass93_8.aClass93_227; local5 != this.aClass93_8; local5 = local5.aClass93_227) {
			local1++;
		}
		return local1;
	}

	@OriginalMember(owner = "client!aat", name = "bh", descriptor = "()I", line = 114)
	public int method444() {
		@Pc(1) int local1 = 0;
		for (@Pc(5) Class93 local5 = this.aClass93_8.aClass93_227; local5 != this.aClass93_8; local5 = local5.aClass93_227) {
			local1++;
		}
		return local1;
	}

	@OriginalMember(owner = "client!aat", name = "bd", descriptor = "()I", line = 114)
	public int method470() {
		@Pc(1) int local1 = 0;
		for (@Pc(5) Class93 local5 = this.aClass93_8.aClass93_227; local5 != this.aClass93_8; local5 = local5.aClass93_227) {
			local1++;
		}
		return local1;
	}

	@OriginalMember(owner = "client!aat", name = "bc", descriptor = "()I", line = 114)
	public int method472() {
		@Pc(1) int local1 = 0;
		for (@Pc(5) Class93 local5 = this.aClass93_8.aClass93_227; local5 != this.aClass93_8; local5 = local5.aClass93_227) {
			local1++;
		}
		return local1;
	}

	@OriginalMember(owner = "client!aat", name = "y", descriptor = "(I)Z", line = 124)
	public boolean method418() {
		return this.aClass93_8.aClass93_227 == this.aClass93_8;
	}

	@OriginalMember(owner = "client!aat", name = "bn", descriptor = "()Z", line = 124)
	public boolean method448() {
		return this.aClass93_8.aClass93_227 == this.aClass93_8;
	}

	@OriginalMember(owner = "client!aat", name = "bi", descriptor = "()Z", line = 124)
	public boolean method471() {
		return this.aClass93_8.aClass93_227 == this.aClass93_8;
	}

	@OriginalMember(owner = "client!aat", name = "bt", descriptor = "()Z", line = 124)
	public boolean method474() {
		return this.aClass93_8.aClass93_227 == this.aClass93_8;
	}

	@OriginalMember(owner = "client!aat", name = "bq", descriptor = "()Z", line = 124)
	public boolean method475() {
		return this.aClass93_8.aClass93_227 == this.aClass93_8;
	}

	@OriginalMember(owner = "client!aat", name = "q", descriptor = "(I)[Lclient!tj;", line = 128)
	Class93[] method419() {
		@Pc(4) Class93[] local4 = new Class93[this.method411()];
		@Pc(6) int local6 = 0;
		for (@Pc(10) Class93 local10 = this.aClass93_8.aClass93_227; local10 != this.aClass93_8; local10 = local10.aClass93_227) {
			local4[local6++] = local10;
		}
		return local4;
	}

	@OriginalMember(owner = "client!aat", name = "bm", descriptor = "()[Lclient!tj;", line = 128)
	Class93[] method476() {
		@Pc(4) Class93[] local4 = new Class93[this.method411()];
		@Pc(6) int local6 = 0;
		for (@Pc(10) Class93 local10 = this.aClass93_8.aClass93_227; local10 != this.aClass93_8; local10 = local10.aClass93_227) {
			local4[local6++] = local10;
		}
		return local4;
	}

	@OriginalMember(owner = "client!aat", name = "iterator", descriptor = "()Ljava/util/Iterator;", line = 139)
	@Override
	public Iterator iterator() {
		return new Class20(this);
	}

	@OriginalMember(owner = "client!aat", name = "d", descriptor = "()Ljava/util/Iterator;", line = 139)
	public Iterator method434() {
		return new Class20(this);
	}

	@OriginalMember(owner = "client!aat", name = "c", descriptor = "()Ljava/util/Iterator;", line = 139)
	public Iterator method435() {
		return new Class20(this);
	}

	@OriginalMember(owner = "client!aat", name = "p", descriptor = "()Ljava/util/Iterator;", line = 139)
	public Iterator method468() {
		return new Class20(this);
	}

	@OriginalMember(owner = "client!aat", name = "h", descriptor = "()I", line = 143)
	public int method437() {
		return this.method411();
	}

	@OriginalMember(owner = "client!aat", name = "size", descriptor = "()I", line = 143)
	@Override
	public int size() {
		return this.method411();
	}

	@OriginalMember(owner = "client!aat", name = "b", descriptor = "()I", line = 143)
	public int method462() {
		return this.method411();
	}

	@OriginalMember(owner = "client!aat", name = "isEmpty", descriptor = "()Z", line = 147)
	@Override
	public boolean isEmpty() {
		return this.method418();
	}

	@OriginalMember(owner = "client!aat", name = "bb", descriptor = "()Z", line = 147)
	public boolean method423() {
		return this.method418();
	}

	@OriginalMember(owner = "client!aat", name = "a", descriptor = "(Ljava/lang/Object;)Z", line = 151)
	public boolean method420(@OriginalArg(0) Object arg0) {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!aat", name = "contains", descriptor = "(Ljava/lang/Object;)Z", line = 151)
	@Override
	public boolean contains(@OriginalArg(0) Object arg0) {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!aat", name = "g", descriptor = "(Ljava/lang/Object;)Z", line = 151)
	public boolean method438(@OriginalArg(0) Object arg0) {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!aat", name = "i", descriptor = "()[Ljava/lang/Object;", line = 155)
	public Object[] method414() {
		return this.method419();
	}

	@OriginalMember(owner = "client!aat", name = "toArray", descriptor = "()[Ljava/lang/Object;", line = 155)
	@Override
	public Object[] toArray() {
		return this.method419();
	}

	@OriginalMember(owner = "client!aat", name = "toArray", descriptor = "([Ljava/lang/Object;)[Ljava/lang/Object;", line = 159)
	@Override
	public Object[] toArray(@OriginalArg(0) Object[] arg0) {
		@Pc(1) int local1 = 0;
		for (@Pc(5) Class93 local5 = this.aClass93_8.aClass93_227; local5 != this.aClass93_8; local5 = local5.aClass93_227) {
			arg0[local1++] = local5;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!aat", name = "be", descriptor = "([Ljava/lang/Object;)[Ljava/lang/Object;", line = 159)
	public Object[] method478(@OriginalArg(0) Object[] arg0) {
		@Pc(1) int local1 = 0;
		for (@Pc(5) Class93 local5 = this.aClass93_8.aClass93_227; local5 != this.aClass93_8; local5 = local5.aClass93_227) {
			arg0[local1++] = local5;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!aat", name = "by", descriptor = "([Ljava/lang/Object;)[Ljava/lang/Object;", line = 159)
	public Object[] method479(@OriginalArg(0) Object[] arg0) {
		@Pc(1) int local1 = 0;
		for (@Pc(5) Class93 local5 = this.aClass93_8.aClass93_227; local5 != this.aClass93_8; local5 = local5.aClass93_227) {
			arg0[local1++] = local5;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!aat", name = "bu", descriptor = "([Ljava/lang/Object;)[Ljava/lang/Object;", line = 159)
	public Object[] method480(@OriginalArg(0) Object[] arg0) {
		@Pc(1) int local1 = 0;
		for (@Pc(5) Class93 local5 = this.aClass93_8.aClass93_227; local5 != this.aClass93_8; local5 = local5.aClass93_227) {
			arg0[local1++] = local5;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!aat", name = "x", descriptor = "(Lclient!tj;I)Z", line = 169)
	boolean method422(@OriginalArg(0) Class93 arg0) {
		this.method407(arg0);
		return true;
	}

	@OriginalMember(owner = "client!aat", name = "bw", descriptor = "(Lclient!tj;)Z", line = 169)
	boolean method481(@OriginalArg(0) Class93 arg0) {
		this.method407(arg0);
		return true;
	}

	@OriginalMember(owner = "client!aat", name = "bo", descriptor = "(Lclient!tj;)Z", line = 169)
	boolean method482(@OriginalArg(0) Class93 arg0) {
		this.method407(arg0);
		return true;
	}

	@OriginalMember(owner = "client!aat", name = "bz", descriptor = "(Ljava/lang/Object;)Z", line = 174)
	public boolean method483(@OriginalArg(0) Object arg0) {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!aat", name = "remove", descriptor = "(Ljava/lang/Object;)Z", line = 174)
	@Override
	public boolean remove(@OriginalArg(0) Object arg0) {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!aat", name = "containsAll", descriptor = "(Ljava/util/Collection;)Z", line = 178)
	@Override
	public boolean containsAll(@OriginalArg(0) Collection arg0) {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!aat", name = "addAll", descriptor = "(Ljava/util/Collection;)Z", line = 182)
	@Override
	public boolean addAll(@OriginalArg(0) Collection arg0) {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!aat", name = "bv", descriptor = "(Ljava/util/Collection;)Z", line = 182)
	public boolean method484(@OriginalArg(0) Collection arg0) {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!aat", name = "removeAll", descriptor = "(Ljava/util/Collection;)Z", line = 186)
	@Override
	public boolean removeAll(@OriginalArg(0) Collection arg0) {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!aat", name = "retainAll", descriptor = "(Ljava/util/Collection;)Z", line = 190)
	@Override
	public boolean retainAll(@OriginalArg(0) Collection arg0) {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!aat", name = "bg", descriptor = "(Ljava/util/Collection;)Z", line = 190)
	public boolean method441(@OriginalArg(0) Collection arg0) {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!aat", name = "br", descriptor = "(Ljava/util/Collection;)Z", line = 190)
	public boolean method485(@OriginalArg(0) Collection arg0) {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!aat", name = "ba", descriptor = "(Ljava/util/Collection;)Z", line = 190)
	public boolean method486(@OriginalArg(0) Collection arg0) {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!aat", name = "bp", descriptor = "(Ljava/util/Collection;)Z", line = 190)
	public boolean method487(@OriginalArg(0) Collection arg0) {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!aat", name = "bj", descriptor = "()V", line = 194)
	public void method426() {
		this.method406();
	}

	@OriginalMember(owner = "client!aat", name = "clear", descriptor = "()V", line = 194)
	@Override
	public void clear() {
		this.method406();
	}

	@OriginalMember(owner = "client!aat", name = "cl", descriptor = "()V", line = 194)
	public void method439() {
		this.method406();
	}

	@OriginalMember(owner = "client!aat", name = "bs", descriptor = "()V", line = 194)
	public void method488() {
		this.method406();
	}

	@OriginalMember(owner = "client!aat", name = "add", descriptor = "(Ljava/lang/Object;)Z", line = 198)
	@Override
	public boolean add(@OriginalArg(0) Object arg0) {
		return this.method422((Class93) arg0);
	}

	@OriginalMember(owner = "client!aat", name = "cg", descriptor = "(Ljava/lang/Object;)Z", line = 198)
	public boolean method490(@OriginalArg(0) Object arg0) {
		return this.method422((Class93) arg0);
	}

	@OriginalMember(owner = "client!aat", name = "ce", descriptor = "(Ljava/lang/Object;)Z", line = 198)
	public boolean method491(@OriginalArg(0) Object arg0) {
		return this.method422((Class93) arg0);
	}

	@OriginalMember(owner = "client!aat", name = "rs", descriptor = "(Ljava/lang/Object;)Z", line = 202)
	public boolean method421(@OriginalArg(0) Object arg0) {
		return super.equals(arg0);
	}

	@OriginalMember(owner = "client!aat", name = "equals", descriptor = "(Ljava/lang/Object;)Z", line = 202)
	@Override
	public boolean equals(@OriginalArg(0) Object arg0) {
		return super.equals(arg0);
	}

	@OriginalMember(owner = "client!aat", name = "rp", descriptor = "(Ljava/lang/Object;)Z", line = 202)
	public boolean method427(@OriginalArg(0) Object arg0) {
		return super.equals(arg0);
	}

	@OriginalMember(owner = "client!aat", name = "rq", descriptor = "(Ljava/lang/Object;)Z", line = 202)
	public boolean method429(@OriginalArg(0) Object arg0) {
		return super.equals(arg0);
	}

	@OriginalMember(owner = "client!aat", name = "ro", descriptor = "(Ljava/lang/Object;)Z", line = 202)
	public boolean method436(@OriginalArg(0) Object arg0) {
		return super.equals(arg0);
	}

	@OriginalMember(owner = "client!aat", name = "hashCode", descriptor = "()I", line = 206)
	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@OriginalMember(owner = "client!aat", name = "rk", descriptor = "()I", line = 206)
	public int method430() {
		return super.hashCode();
	}

	@OriginalMember(owner = "client!aat", name = "rm", descriptor = "()I", line = 206)
	public int method431() {
		return super.hashCode();
	}

	@OriginalMember(owner = "client!aat", name = "ri", descriptor = "()I", line = 206)
	public int method432() {
		return super.hashCode();
	}

	@OriginalMember(owner = "client!aat", name = "ad", descriptor = "(Lclient!yf;I)V", line = 4943)
	static final void method494(@OriginalArg(0) Class681 arg0) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = arg0.anIntArray517[arg0.anIntArray520[arg0.anInt5889 * -709694321]];
	}

	@OriginalMember(owner = "client!aat", name = "ut", descriptor = "(Lclient!yf;S)V", line = 8625)
	static final void method493(@OriginalArg(0) Class681 arg0) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32805(local12);
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local16.anInt4006 * 1332164047;
	}
}
