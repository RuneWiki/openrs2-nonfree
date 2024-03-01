package com.jagex;

import java.util.Collection;
import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wk")
public class Class553 implements Iterable, Collection {

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "Lclient!ps;")
	Class3 aClass3_237;

	@OriginalMember(owner = "client!wk", name = "p", descriptor = "Lclient!ps;")
	public Class3 aClass3_238 = new Class3();

	@OriginalMember(owner = "client!wk", name = "<init>", descriptor = "()V", line = 10)
	public Class553() {
		this.aClass3_238.aClass3_246 = this.aClass3_238;
		this.aClass3_238.aClass3_245 = this.aClass3_238;
	}

	@OriginalMember(owner = "client!wk", name = "p", descriptor = "(I)V", line = 16)
	public void method32701() {
		while (this.aClass3_238 != this.aClass3_238.aClass3_246) {
			this.aClass3_238.aClass3_246.method33656();
		}
	}

	@OriginalMember(owner = "client!wk", name = "i", descriptor = "()V", line = 16)
	public void method32728() {
		while (this.aClass3_238 != this.aClass3_238.aClass3_246) {
			this.aClass3_238.aClass3_246.method33656();
		}
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lclient!ps;I)V", line = 22)
	public void method32702(@OriginalArg(0) Class3 arg0) {
		if (arg0.aClass3_245 != null) {
			arg0.method33656();
		}
		arg0.aClass3_245 = this.aClass3_238.aClass3_245;
		arg0.aClass3_246 = this.aClass3_238;
		arg0.aClass3_245.aClass3_246 = arg0;
		arg0.aClass3_246.aClass3_245 = arg0;
	}

	@OriginalMember(owner = "client!wk", name = "s", descriptor = "(I)Lclient!ps;", line = 38)
	public Class3 method32718() {
		@Pc(3) Class3 local3 = this.aClass3_238.aClass3_246;
		if (this.aClass3_238 == local3) {
			return null;
		} else {
			local3.method33656();
			return local3;
		}
	}

	@OriginalMember(owner = "client!wk", name = "k", descriptor = "()Lclient!ps;", line = 38)
	public Class3 method32726() {
		@Pc(3) Class3 local3 = this.aClass3_238.aClass3_246;
		if (this.aClass3_238 == local3) {
			return null;
		} else {
			local3.method33656();
			return local3;
		}
	}

	@OriginalMember(owner = "client!wk", name = "f", descriptor = "()Lclient!ps;", line = 38)
	public Class3 method32729() {
		@Pc(3) Class3 local3 = this.aClass3_238.aClass3_246;
		if (this.aClass3_238 == local3) {
			return null;
		} else {
			local3.method33656();
			return local3;
		}
	}

	@OriginalMember(owner = "client!wk", name = "at", descriptor = "()Lclient!ps;", line = 38)
	public Class3 method32730() {
		@Pc(3) Class3 local3 = this.aClass3_238.aClass3_246;
		if (this.aClass3_238 == local3) {
			return null;
		} else {
			local3.method33656();
			return local3;
		}
	}

	@OriginalMember(owner = "client!wk", name = "u", descriptor = "(Lclient!wk;Lclient!ps;I)V", line = 45)
	void method32704(@OriginalArg(0) Class553 arg0, @OriginalArg(1) Class3 arg1) {
		@Pc(3) Class3 local3 = this.aClass3_238.aClass3_245;
		this.aClass3_238.aClass3_245 = arg1.aClass3_245;
		arg1.aClass3_245.aClass3_246 = this.aClass3_238;
		if (this.aClass3_238 != arg1) {
			arg1.aClass3_245 = arg0.aClass3_238.aClass3_245;
			arg1.aClass3_245.aClass3_246 = arg1;
			local3.aClass3_246 = arg0.aClass3_238;
			arg0.aClass3_238.aClass3_245 = local3;
		}
	}

	@OriginalMember(owner = "client!wk", name = "af", descriptor = "(Lclient!wk;Lclient!ps;)V", line = 45)
	void method32732(@OriginalArg(0) Class553 arg0, @OriginalArg(1) Class3 arg1) {
		@Pc(3) Class3 local3 = this.aClass3_238.aClass3_245;
		this.aClass3_238.aClass3_245 = arg1.aClass3_245;
		arg1.aClass3_245.aClass3_246 = this.aClass3_238;
		if (this.aClass3_238 != arg1) {
			arg1.aClass3_245 = arg0.aClass3_238.aClass3_245;
			arg1.aClass3_245.aClass3_246 = arg1;
			local3.aClass3_246 = arg0.aClass3_238;
			arg0.aClass3_238.aClass3_245 = local3;
		}
	}

	@OriginalMember(owner = "client!wk", name = "ak", descriptor = "(Lclient!wk;Lclient!ps;)V", line = 45)
	void method32733(@OriginalArg(0) Class553 arg0, @OriginalArg(1) Class3 arg1) {
		@Pc(3) Class3 local3 = this.aClass3_238.aClass3_245;
		this.aClass3_238.aClass3_245 = arg1.aClass3_245;
		arg1.aClass3_245.aClass3_246 = this.aClass3_238;
		if (this.aClass3_238 != arg1) {
			arg1.aClass3_245 = arg0.aClass3_238.aClass3_245;
			arg1.aClass3_245.aClass3_246 = arg1;
			local3.aClass3_246 = arg0.aClass3_238;
			arg0.aClass3_238.aClass3_245 = local3;
		}
	}

	@OriginalMember(owner = "client!wk", name = "aa", descriptor = "(Lclient!wk;)V", line = 57)
	public void method32734(@OriginalArg(0) Class553 arg0) {
		if (this.aClass3_238 != this.aClass3_238.aClass3_246) {
			this.method32704(arg0, this.aClass3_238.aClass3_246);
		}
	}

	@OriginalMember(owner = "client!wk", name = "y", descriptor = "(Lclient!wk;B)V", line = 57)
	public void method32748(@OriginalArg(0) Class553 arg0) {
		if (this.aClass3_238 != this.aClass3_238.aClass3_246) {
			this.method32704(arg0, this.aClass3_238.aClass3_246);
		}
	}

	@OriginalMember(owner = "client!wk", name = "ah", descriptor = "(Lclient!wk;)V", line = 57)
	public void method32752(@OriginalArg(0) Class553 arg0) {
		if (this.aClass3_238 != this.aClass3_238.aClass3_246) {
			this.method32704(arg0, this.aClass3_238.aClass3_246);
		}
	}

	@OriginalMember(owner = "client!wk", name = "an", descriptor = "()Lclient!ps;", line = 62)
	public Class3 method32735() {
		return this.method32706(null);
	}

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "(B)Lclient!ps;", line = 62)
	public Class3 method32768() {
		return this.method32706(null);
	}

	@OriginalMember(owner = "client!wk", name = "c", descriptor = "(Lclient!ps;I)Lclient!ps;", line = 67)
	Class3 method32706(@OriginalArg(0) Class3 arg0) {
		@Pc(6) Class3 local6;
		if (arg0 == null) {
			local6 = this.aClass3_238.aClass3_246;
		} else {
			local6 = arg0;
		}
		if (this.aClass3_238 == local6) {
			this.aClass3_237 = null;
			return null;
		} else {
			this.aClass3_237 = local6.aClass3_246;
			return local6;
		}
	}

	@OriginalMember(owner = "client!wk", name = "aj", descriptor = "(Lclient!ps;)Lclient!ps;", line = 67)
	Class3 method32736(@OriginalArg(0) Class3 arg0) {
		@Pc(6) Class3 local6;
		if (arg0 == null) {
			local6 = this.aClass3_238.aClass3_246;
		} else {
			local6 = arg0;
		}
		if (this.aClass3_238 == local6) {
			this.aClass3_237 = null;
			return null;
		} else {
			this.aClass3_237 = local6.aClass3_246;
			return local6;
		}
	}

	@OriginalMember(owner = "client!wk", name = "as", descriptor = "(Lclient!ps;)Lclient!ps;", line = 67)
	Class3 method32737(@OriginalArg(0) Class3 arg0) {
		@Pc(6) Class3 local6;
		if (arg0 == null) {
			local6 = this.aClass3_238.aClass3_246;
		} else {
			local6 = arg0;
		}
		if (this.aClass3_238 == local6) {
			this.aClass3_237 = null;
			return null;
		} else {
			this.aClass3_237 = local6.aClass3_246;
			return local6;
		}
	}

	@OriginalMember(owner = "client!wk", name = "ai", descriptor = "(Lclient!ps;)Lclient!ps;", line = 67)
	Class3 method32738(@OriginalArg(0) Class3 arg0) {
		@Pc(6) Class3 local6;
		if (arg0 == null) {
			local6 = this.aClass3_238.aClass3_246;
		} else {
			local6 = arg0;
		}
		if (this.aClass3_238 == local6) {
			this.aClass3_237 = null;
			return null;
		} else {
			this.aClass3_237 = local6.aClass3_246;
			return local6;
		}
	}

	@OriginalMember(owner = "client!wk", name = "z", descriptor = "(I)Lclient!ps;", line = 78)
	public Class3 method32727() {
		return this.method32708(null);
	}

	@OriginalMember(owner = "client!wk", name = "aq", descriptor = "()Lclient!ps;", line = 78)
	public Class3 method32739() {
		return this.method32708(null);
	}

	@OriginalMember(owner = "client!wk", name = "av", descriptor = "()Lclient!ps;", line = 78)
	public Class3 method32740() {
		return this.method32708(null);
	}

	@OriginalMember(owner = "client!wk", name = "j", descriptor = "(Lclient!ps;B)Lclient!ps;", line = 83)
	Class3 method32708(@OriginalArg(0) Class3 arg0) {
		@Pc(5) Class3 local5;
		if (arg0 == null) {
			local5 = this.aClass3_238.aClass3_245;
		} else {
			local5 = arg0;
		}
		if (this.aClass3_238 == local5) {
			this.aClass3_237 = null;
			return null;
		} else {
			this.aClass3_237 = local5.aClass3_245;
			return local5;
		}
	}

	@OriginalMember(owner = "client!wk", name = "ax", descriptor = "(Lclient!ps;)Lclient!ps;", line = 83)
	Class3 method32741(@OriginalArg(0) Class3 arg0) {
		@Pc(5) Class3 local5;
		if (arg0 == null) {
			local5 = this.aClass3_238.aClass3_245;
		} else {
			local5 = arg0;
		}
		if (this.aClass3_238 == local5) {
			this.aClass3_237 = null;
			return null;
		} else {
			this.aClass3_237 = local5.aClass3_245;
			return local5;
		}
	}

	@OriginalMember(owner = "client!wk", name = "ao", descriptor = "()Lclient!ps;", line = 94)
	public Class3 method32703() {
		@Pc(2) Class3 local2 = this.aClass3_237;
		if (local2 == this.aClass3_238) {
			this.aClass3_237 = null;
			return null;
		} else {
			this.aClass3_237 = local2.aClass3_246;
			return local2;
		}
	}

	@OriginalMember(owner = "client!wk", name = "n", descriptor = "(I)Lclient!ps;", line = 94)
	public Class3 method32709() {
		@Pc(2) Class3 local2 = this.aClass3_237;
		if (local2 == this.aClass3_238) {
			this.aClass3_237 = null;
			return null;
		} else {
			this.aClass3_237 = local2.aClass3_246;
			return local2;
		}
	}

	@OriginalMember(owner = "client!wk", name = "az", descriptor = "()Lclient!ps;", line = 94)
	public Class3 method32742() {
		@Pc(2) Class3 local2 = this.aClass3_237;
		if (local2 == this.aClass3_238) {
			this.aClass3_237 = null;
			return null;
		} else {
			this.aClass3_237 = local2.aClass3_246;
			return local2;
		}
	}

	@OriginalMember(owner = "client!wk", name = "al", descriptor = "()Lclient!ps;", line = 94)
	public Class3 method32743() {
		@Pc(2) Class3 local2 = this.aClass3_237;
		if (local2 == this.aClass3_238) {
			this.aClass3_237 = null;
			return null;
		} else {
			this.aClass3_237 = local2.aClass3_246;
			return local2;
		}
	}

	@OriginalMember(owner = "client!wk", name = "e", descriptor = "(I)Lclient!ps;", line = 104)
	public Class3 method32716() {
		@Pc(2) Class3 local2 = this.aClass3_237;
		if (local2 == this.aClass3_238) {
			this.aClass3_237 = null;
			return null;
		} else {
			this.aClass3_237 = local2.aClass3_245;
			return local2;
		}
	}

	@OriginalMember(owner = "client!wk", name = "ap", descriptor = "()Lclient!ps;", line = 104)
	public Class3 method32745() {
		@Pc(2) Class3 local2 = this.aClass3_237;
		if (local2 == this.aClass3_238) {
			this.aClass3_237 = null;
			return null;
		} else {
			this.aClass3_237 = local2.aClass3_245;
			return local2;
		}
	}

	@OriginalMember(owner = "client!wk", name = "ab", descriptor = "()I", line = 114)
	public int method32714() {
		@Pc(1) int local1 = 0;
		for (@Pc(5) Class3 local5 = this.aClass3_238.aClass3_246; local5 != this.aClass3_238; local5 = local5.aClass3_246) {
			local1++;
		}
		return local1;
	}

	@OriginalMember(owner = "client!wk", name = "r", descriptor = "(B)I", line = 114)
	public int method32725() {
		@Pc(1) int local1 = 0;
		for (@Pc(5) Class3 local5 = this.aClass3_238.aClass3_246; local5 != this.aClass3_238; local5 = local5.aClass3_246) {
			local1++;
		}
		return local1;
	}

	@OriginalMember(owner = "client!wk", name = "au", descriptor = "()I", line = 114)
	public int method32747() {
		@Pc(1) int local1 = 0;
		for (@Pc(5) Class3 local5 = this.aClass3_238.aClass3_246; local5 != this.aClass3_238; local5 = local5.aClass3_246) {
			local1++;
		}
		return local1;
	}

	@OriginalMember(owner = "client!wk", name = "d", descriptor = "(I)Z", line = 124)
	public boolean method32712() {
		return this.aClass3_238.aClass3_246 == this.aClass3_238;
	}

	@OriginalMember(owner = "client!wk", name = "ay", descriptor = "()Z", line = 124)
	public boolean method32744() {
		return this.aClass3_238.aClass3_246 == this.aClass3_238;
	}

	@OriginalMember(owner = "client!wk", name = "ag", descriptor = "()Z", line = 124)
	public boolean method32749() {
		return this.aClass3_238.aClass3_246 == this.aClass3_238;
	}

	@OriginalMember(owner = "client!wk", name = "q", descriptor = "(I)[Lclient!ps;", line = 128)
	Class3[] method32715() {
		@Pc(4) Class3[] local4 = new Class3[this.method32725()];
		@Pc(6) int local6 = 0;
		for (@Pc(10) Class3 local10 = this.aClass3_238.aClass3_246; local10 != this.aClass3_238; local10 = local10.aClass3_246) {
			local4[local6++] = local10;
		}
		return local4;
	}

	@OriginalMember(owner = "client!wk", name = "am", descriptor = "()[Lclient!ps;", line = 128)
	Class3[] method32771() {
		@Pc(4) Class3[] local4 = new Class3[this.method32725()];
		@Pc(6) int local6 = 0;
		for (@Pc(10) Class3 local10 = this.aClass3_238.aClass3_246; local10 != this.aClass3_238; local10 = local10.aClass3_246) {
			local4[local6++] = local10;
		}
		return local4;
	}

	@OriginalMember(owner = "client!wk", name = "h", descriptor = "(B)V", line = 134)
	public static final void method32773() {
		if (Class190.anInt3648 * -1033304397 != 1) {
			Class615.aClass82_3.method21604();
			Class23.method5942();
			Class555.method32796();
		}
	}

	@OriginalMember(owner = "client!wk", name = "iterator", descriptor = "()Ljava/util/Iterator;", line = 139)
	@Override
	public Iterator iterator() {
		return new Class554(this);
	}

	@OriginalMember(owner = "client!wk", name = "x", descriptor = "()Ljava/util/Iterator;", line = 139)
	public Iterator method32731() {
		return new Class554(this);
	}

	@OriginalMember(owner = "client!wk", name = "l", descriptor = "()Ljava/util/Iterator;", line = 139)
	public Iterator method32750() {
		return new Class554(this);
	}

	@OriginalMember(owner = "client!wk", name = "h", descriptor = "()Ljava/util/Iterator;", line = 139)
	public Iterator method32751() {
		return new Class554(this);
	}

	@OriginalMember(owner = "client!wk", name = "t", descriptor = "()I", line = 143)
	public int method32707() {
		return this.method32725();
	}

	@OriginalMember(owner = "client!wk", name = "size", descriptor = "()I", line = 143)
	@Override
	public int size() {
		return this.method32725();
	}

	@OriginalMember(owner = "client!wk", name = "v", descriptor = "()I", line = 143)
	public int method32719() {
		return this.method32725();
	}

	@OriginalMember(owner = "client!wk", name = "ar", descriptor = "()Z", line = 147)
	public boolean method32720() {
		return this.method32712();
	}

	@OriginalMember(owner = "client!wk", name = "isEmpty", descriptor = "()Z", line = 147)
	@Override
	public boolean isEmpty() {
		return this.method32712();
	}

	@OriginalMember(owner = "client!wk", name = "ad", descriptor = "()Z", line = 147)
	public boolean method32753() {
		return this.method32712();
	}

	@OriginalMember(owner = "client!wk", name = "ae", descriptor = "()Z", line = 147)
	public boolean method32764() {
		return this.method32712();
	}

	@OriginalMember(owner = "client!wk", name = "contains", descriptor = "(Ljava/lang/Object;)Z", line = 151)
	@Override
	public boolean contains(@OriginalArg(0) Object arg0) {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!wk", name = "aw", descriptor = "(Ljava/lang/Object;)Z", line = 151)
	public boolean method32724(@OriginalArg(0) Object arg0) {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!wk", name = "ac", descriptor = "(Ljava/lang/Object;)Z", line = 151)
	public boolean method32755(@OriginalArg(0) Object arg0) {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!wk", name = "toArray", descriptor = "()[Ljava/lang/Object;", line = 155)
	@Override
	public Object[] toArray() {
		return this.method32715();
	}

	@OriginalMember(owner = "client!wk", name = "o", descriptor = "()[Ljava/lang/Object;", line = 155)
	public Object[] method32722() {
		return this.method32715();
	}

	@OriginalMember(owner = "client!wk", name = "toArray", descriptor = "([Ljava/lang/Object;)[Ljava/lang/Object;", line = 159)
	@Override
	public Object[] toArray(@OriginalArg(0) Object[] arg0) {
		@Pc(1) int local1 = 0;
		for (@Pc(5) Class3 local5 = this.aClass3_238.aClass3_246; local5 != this.aClass3_238; local5 = local5.aClass3_246) {
			arg0[local1++] = local5;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!wk", name = "m", descriptor = "(Lclient!ps;I)Z", line = 169)
	boolean method32705(@OriginalArg(0) Class3 arg0) {
		this.method32702(arg0);
		return true;
	}

	@OriginalMember(owner = "client!wk", name = "bd", descriptor = "(Lclient!ps;)Z", line = 169)
	boolean method32746(@OriginalArg(0) Class3 arg0) {
		this.method32702(arg0);
		return true;
	}

	@OriginalMember(owner = "client!wk", name = "bw", descriptor = "(Lclient!ps;)Z", line = 169)
	boolean method32756(@OriginalArg(0) Class3 arg0) {
		this.method32702(arg0);
		return true;
	}

	@OriginalMember(owner = "client!wk", name = "bp", descriptor = "(Lclient!ps;)Z", line = 169)
	boolean method32757(@OriginalArg(0) Class3 arg0) {
		this.method32702(arg0);
		return true;
	}

	@OriginalMember(owner = "client!wk", name = "remove", descriptor = "(Ljava/lang/Object;)Z", line = 174)
	@Override
	public boolean remove(@OriginalArg(0) Object arg0) {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!wk", name = "w", descriptor = "(Ljava/lang/Object;)Z", line = 174)
	public boolean method32721(@OriginalArg(0) Object arg0) {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!wk", name = "containsAll", descriptor = "(Ljava/util/Collection;)Z", line = 178)
	@Override
	public boolean containsAll(@OriginalArg(0) Collection arg0) {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!wk", name = "bs", descriptor = "(Ljava/util/Collection;)Z", line = 178)
	public boolean method32759(@OriginalArg(0) Collection arg0) {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!wk", name = "addAll", descriptor = "(Ljava/util/Collection;)Z", line = 182)
	@Override
	public boolean addAll(@OriginalArg(0) Collection arg0) {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!wk", name = "bm", descriptor = "(Ljava/util/Collection;)Z", line = 182)
	public boolean method32760(@OriginalArg(0) Collection arg0) {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!wk", name = "removeAll", descriptor = "(Ljava/util/Collection;)Z", line = 186)
	@Override
	public boolean removeAll(@OriginalArg(0) Collection arg0) {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!wk", name = "bf", descriptor = "(Ljava/util/Collection;)Z", line = 186)
	public boolean method32761(@OriginalArg(0) Collection arg0) {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!wk", name = "retainAll", descriptor = "(Ljava/util/Collection;)Z", line = 190)
	@Override
	public boolean retainAll(@OriginalArg(0) Collection arg0) {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!wk", name = "bt", descriptor = "(Ljava/util/Collection;)Z", line = 190)
	public boolean method32762(@OriginalArg(0) Collection arg0) {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!wk", name = "bk", descriptor = "(Ljava/util/Collection;)Z", line = 190)
	public boolean method32763(@OriginalArg(0) Collection arg0) {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!wk", name = "bl", descriptor = "()V", line = 194)
	public void method32710() {
		this.method32701();
	}

	@OriginalMember(owner = "client!wk", name = "bg", descriptor = "()V", line = 194)
	public void method32713() {
		this.method32701();
	}

	@OriginalMember(owner = "client!wk", name = "clear", descriptor = "()V", line = 194)
	@Override
	public void clear() {
		this.method32701();
	}

	@OriginalMember(owner = "client!wk", name = "br", descriptor = "()V", line = 194)
	public void method32765() {
		this.method32701();
	}

	@OriginalMember(owner = "client!wk", name = "bb", descriptor = "()V", line = 194)
	public void method32766() {
		this.method32701();
	}

	@OriginalMember(owner = "client!wk", name = "by", descriptor = "()V", line = 194)
	public void method32767() {
		this.method32701();
	}

	@OriginalMember(owner = "client!wk", name = "add", descriptor = "(Ljava/lang/Object;)Z", line = 198)
	@Override
	public boolean add(@OriginalArg(0) Object arg0) {
		return this.method32705((Class3) arg0);
	}

	@OriginalMember(owner = "client!wk", name = "ba", descriptor = "(Ljava/lang/Object;)Z", line = 198)
	public boolean method32754(@OriginalArg(0) Object arg0) {
		return this.method32705((Class3) arg0);
	}

	@OriginalMember(owner = "client!wk", name = "bi", descriptor = "(Ljava/lang/Object;)Z", line = 198)
	public boolean method32769(@OriginalArg(0) Object arg0) {
		return this.method32705((Class3) arg0);
	}

	@OriginalMember(owner = "client!wk", name = "bu", descriptor = "(Ljava/lang/Object;)Z", line = 198)
	public boolean method32770(@OriginalArg(0) Object arg0) {
		return this.method32705((Class3) arg0);
	}

	@OriginalMember(owner = "client!wk", name = "bo", descriptor = "(Ljava/lang/Object;)Z", line = 198)
	public boolean method32772(@OriginalArg(0) Object arg0) {
		return this.method32705((Class3) arg0);
	}

	@OriginalMember(owner = "client!wk", name = "equals", descriptor = "(Ljava/lang/Object;)Z", line = 202)
	@Override
	public boolean equals(@OriginalArg(0) Object arg0) {
		return super.equals(arg0);
	}

	@OriginalMember(owner = "client!wk", name = "hm", descriptor = "(Ljava/lang/Object;)Z", line = 202)
	public boolean method32717(@OriginalArg(0) Object arg0) {
		return super.equals(arg0);
	}

	@OriginalMember(owner = "client!wk", name = "ib", descriptor = "(Ljava/lang/Object;)Z", line = 202)
	public boolean method32758(@OriginalArg(0) Object arg0) {
		return super.equals(arg0);
	}

	@OriginalMember(owner = "client!wk", name = "oy", descriptor = "()I", line = 206)
	public int method32711() {
		return super.hashCode();
	}

	@OriginalMember(owner = "client!wk", name = "hashCode", descriptor = "()I", line = 206)
	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@OriginalMember(owner = "client!wk", name = "ol", descriptor = "()I", line = 206)
	public int method32723() {
		return super.hashCode();
	}
}
