package com.jagex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fd")
public class Class243 {

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "I")
	static final int anInt3790 = 1;

	@OriginalMember(owner = "client!fd", name = "v", descriptor = "I")
	static final int anInt3791 = 2;

	@OriginalMember(owner = "client!fd", name = "l", descriptor = "I")
	static final int anInt3793 = 4;

	@OriginalMember(owner = "client!fd", name = "p", descriptor = "I")
	static final int anInt3796 = 1;

	@OriginalMember(owner = "client!fd", name = "j", descriptor = "I")
	int anInt3795 = 1671172763;

	@OriginalMember(owner = "client!fd", name = "y", descriptor = "J")
	final long aLong248;

	@OriginalMember(owner = "client!fd", name = "q", descriptor = "Z")
	final boolean aBoolean652;

	@OriginalMember(owner = "client!fd", name = "g", descriptor = "Z")
	boolean aBoolean653;

	@OriginalMember(owner = "client!fd", name = "z", descriptor = "Z")
	boolean aBoolean651;

	@OriginalMember(owner = "client!fd", name = "i", descriptor = "I")
	int anInt3794;

	@OriginalMember(owner = "client!fd", name = "w", descriptor = "J")
	final long aLong249;

	@OriginalMember(owner = "client!fd", name = "t", descriptor = "Ljava/lang/String;")
	final String aString173;

	@OriginalMember(owner = "client!fd", name = "x", descriptor = "I")
	final int anInt3792;

	@OriginalMember(owner = "client!fd", name = "s", descriptor = "Ljava/util/ArrayList;")
	final ArrayList anArrayList3;

	@OriginalMember(owner = "client!fd", name = "r", descriptor = "Ljava/util/ArrayList;")
	final ArrayList anArrayList4;

	@OriginalMember(owner = "client!fd", name = "d", descriptor = "Lclient!aah;")
	final Class9 aClass9_3;

	@OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(JLclient!akv;ZLclient!fo;)V", line = 31)
	public Class243(@OriginalArg(0) long arg0, @OriginalArg(1) Class77_Sub39 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Interface26 arg3) {
		this.aLong248 = arg0 * 3517310916911409801L;
		@Pc(13) int local13 = arg1.method22478();
		if (local13 <= 0 || local13 > 1) {
			throw new IllegalStateException("");
		}
		@Pc(27) int local27 = arg1.method22478();
		this.aBoolean652 = (local27 & 0x1) != 0;
		this.aBoolean653 = (local27 & 0x2) != 0;
		this.aBoolean651 = (local27 & 0x4) != 0;
		this.anInt3794 = arg1.method22500() * -738365803;
		this.aLong249 = arg1.method22510() * -7781335585505674303L;
		this.aString173 = arg1.method22523();
		this.anInt3792 = arg1.method22487() * 1225437771;
		arg1.method22500();
		arg1.method22510();
		@Pc(92) int local92 = arg1.method22483();
		this.anArrayList3 = new ArrayList(local92);
		@Pc(100) int local100;
		for (local100 = 0; local100 < local92; local100++) {
			this.anArrayList3.add(new Class241(arg1, this.aBoolean653, this.aBoolean651, arg3));
		}
		local100 = arg1.method22483();
		this.anArrayList4 = new ArrayList(local100);
		@Pc(130) int local130;
		for (local130 = 0; local130 < local100; local130++) {
			this.anArrayList4.add(new Class254(arg1, this.aBoolean653, this.aBoolean651));
		}
		this.aClass9_3 = new Class9(arg3.method25526());
		local130 = arg1.method22483();
		for (@Pc(161) int local161 = 0; local161 < local130; local161++) {
			@Pc(171) Class438 local171 = arg3.method25526().method1949(arg1);
			this.aClass9_3.method128(local171.anInt4927 * -608978823, local171.anObject19);
		}
		if (!arg2) {
			arg1.method22483();
			arg1.method22483();
			arg1.method22483();
			arg1.method22483();
			arg1.method22483();
		}
		this.method26044();
	}

	@OriginalMember(owner = "client!fd", name = "v", descriptor = "(IB)I", line = 39)
	static final int method26023(@OriginalArg(0) int arg0) {
		return arg0 < 7 ? 7 : 10;
	}

	@OriginalMember(owner = "client!fd", name = "p", descriptor = "(I)Ljava/util/List;", line = 75)
	public List method26024() {
		return Collections.unmodifiableList(this.anArrayList3);
	}

	@OriginalMember(owner = "client!fd", name = "h", descriptor = "()Ljava/util/List;", line = 75)
	public List method26025() {
		return Collections.unmodifiableList(this.anArrayList3);
	}

	@OriginalMember(owner = "client!fd", name = "aj", descriptor = "()Ljava/util/List;", line = 79)
	public List method26026() {
		return Collections.unmodifiableList(this.anArrayList4);
	}

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "(I)Ljava/util/List;", line = 79)
	public List method26027() {
		return Collections.unmodifiableList(this.anArrayList4);
	}

	@OriginalMember(owner = "client!fd", name = "v", descriptor = "(B)I", line = 83)
	int method26028() {
		return this.anInt3794 * 1394928829;
	}

	@OriginalMember(owner = "client!fd", name = "l", descriptor = "(B)V", line = 87)
	void method26029() {
		this.anInt3794 += -738365803;
	}

	@OriginalMember(owner = "client!fd", name = "ai", descriptor = "()V", line = 87)
	void method26030() {
		this.anInt3794 += -738365803;
	}

	@OriginalMember(owner = "client!fd", name = "ag", descriptor = "()V", line = 87)
	void method26031() {
		this.anInt3794 += -738365803;
	}

	@OriginalMember(owner = "client!fd", name = "al", descriptor = "()V", line = 87)
	void method26032() {
		this.anInt3794 += -738365803;
	}

	@OriginalMember(owner = "client!fd", name = "y", descriptor = "(I)Z", line = 91)
	public boolean method26033() {
		return this.aBoolean652;
	}

	@OriginalMember(owner = "client!fd", name = "ao", descriptor = "()Z", line = 91)
	public boolean method26034() {
		return this.aBoolean652;
	}

	@OriginalMember(owner = "client!fd", name = "ax", descriptor = "()Z", line = 91)
	public boolean method26035() {
		return this.aBoolean652;
	}

	@OriginalMember(owner = "client!fd", name = "au", descriptor = "()Z", line = 91)
	public boolean method26036() {
		return this.aBoolean652;
	}

	@OriginalMember(owner = "client!fd", name = "ak", descriptor = "()Z", line = 91)
	public boolean method26037() {
		return this.aBoolean652;
	}

	@OriginalMember(owner = "client!fd", name = "w", descriptor = "(I)I", line = 95)
	public int method26038() {
		return this.anInt3792 * -1948842141;
	}

	@OriginalMember(owner = "client!fd", name = "ar", descriptor = "()I", line = 95)
	public int method26039() {
		return this.anInt3792 * -1948842141;
	}

	@OriginalMember(owner = "client!fd", name = "t", descriptor = "(B)J", line = 99)
	public long method26040() {
		return this.aLong249 * 338886626505790529L;
	}

	@OriginalMember(owner = "client!fd", name = "ad", descriptor = "()J", line = 99)
	public long method26041() {
		return this.aLong249 * 338886626505790529L;
	}

	@OriginalMember(owner = "client!fd", name = "ac", descriptor = "()J", line = 99)
	public long method26042() {
		return this.aLong249 * 338886626505790529L;
	}

	@OriginalMember(owner = "client!fd", name = "hashCode", descriptor = "()I", line = 103)
	@Override
	public int hashCode() {
		return (int) (this.aLong248 * -7721770475843032135L);
	}

	@OriginalMember(owner = "client!fd", name = "rr", descriptor = "()I", line = 103)
	public int method26043() {
		return (int) (this.aLong248 * -7721770475843032135L);
	}

	@OriginalMember(owner = "client!fd", name = "q", descriptor = "(I)V", line = 107)
	void method26044() {
		@Pc(1) int local1 = -1;
		@Pc(3) int local3 = -1;
		for (@Pc(5) int local5 = 0; local5 < this.anArrayList3.size(); local5++) {
			@Pc(16) Class241 local16 = (Class241) this.anArrayList3.get(local5);
			@Pc(20) int local20 = local16.method25954();
			if (local20 > local1) {
				local1 = local20;
				local3 = local5;
			}
		}
		this.anInt3795 = local3 * -1671172763;
	}

	@OriginalMember(owner = "client!fd", name = "av", descriptor = "()V", line = 107)
	void method26045() {
		@Pc(1) int local1 = -1;
		@Pc(3) int local3 = -1;
		for (@Pc(5) int local5 = 0; local5 < this.anArrayList3.size(); local5++) {
			@Pc(16) Class241 local16 = (Class241) this.anArrayList3.get(local5);
			@Pc(20) int local20 = local16.method25954();
			if (local20 > local1) {
				local1 = local20;
				local3 = local5;
			}
		}
		this.anInt3795 = local3 * -1671172763;
	}

	@OriginalMember(owner = "client!fd", name = "at", descriptor = "()V", line = 107)
	void method26046() {
		@Pc(1) int local1 = -1;
		@Pc(3) int local3 = -1;
		for (@Pc(5) int local5 = 0; local5 < this.anArrayList3.size(); local5++) {
			@Pc(16) Class241 local16 = (Class241) this.anArrayList3.get(local5);
			@Pc(20) int local20 = local16.method25954();
			if (local20 > local1) {
				local1 = local20;
				local3 = local5;
			}
		}
		this.anInt3795 = local3 * -1671172763;
	}

	@OriginalMember(owner = "client!fd", name = "ae", descriptor = "()V", line = 107)
	void method26047() {
		@Pc(1) int local1 = -1;
		@Pc(3) int local3 = -1;
		for (@Pc(5) int local5 = 0; local5 < this.anArrayList3.size(); local5++) {
			@Pc(16) Class241 local16 = (Class241) this.anArrayList3.get(local5);
			@Pc(20) int local20 = local16.method25954();
			if (local20 > local1) {
				local1 = local20;
				local3 = local5;
			}
		}
		this.anInt3795 = local3 * -1671172763;
	}

	@OriginalMember(owner = "client!fd", name = "x", descriptor = "(I)I", line = 121)
	public int method26048() {
		return this.anInt3795 * -1330938771;
	}

	@OriginalMember(owner = "client!fd", name = "ah", descriptor = "()I", line = 121)
	public int method26049() {
		return this.anInt3795 * -1330938771;
	}

	@OriginalMember(owner = "client!fd", name = "as", descriptor = "()I", line = 121)
	public int method26050() {
		return this.anInt3795 * -1330938771;
	}

	@OriginalMember(owner = "client!fd", name = "d", descriptor = "(I)Lclient!gz;", line = 125)
	public Class290 method26051() {
		if (this.anArrayList3.isEmpty()) {
			return Class290.aClass290_4;
		}
		@Pc(13) Class290 local13 = ((Class241) this.anArrayList3.get(0)).method25979();
		switch(local13.anInt4005 * -1208833837) {
			case 1:
			case 3:
				return local13;
			default:
				@Pc(24) Iterator local24 = this.anArrayList3.iterator();
				@Pc(31) Class241 local31;
				do {
					if (!local24.hasNext()) {
						return Class290.aClass290_2;
					}
					local31 = (Class241) local24.next();
				} while (local31.method25979() != Class290.aClass290_4);
				return Class290.aClass290_4;
		}
	}

	@OriginalMember(owner = "client!fd", name = "am", descriptor = "()Lclient!gz;", line = 125)
	public Class290 method26052() {
		if (this.anArrayList3.isEmpty()) {
			return Class290.aClass290_4;
		}
		@Pc(13) Class290 local13 = ((Class241) this.anArrayList3.get(0)).method25979();
		switch(local13.anInt4005 * -1208833837) {
			case 1:
			case 3:
				return local13;
			default:
				@Pc(24) Iterator local24 = this.anArrayList3.iterator();
				@Pc(31) Class241 local31;
				do {
					if (!local24.hasNext()) {
						return Class290.aClass290_2;
					}
					local31 = (Class241) local24.next();
				} while (local31.method25979() != Class290.aClass290_4);
				return Class290.aClass290_4;
		}
	}

	@OriginalMember(owner = "client!fd", name = "aq", descriptor = "()Lclient!gz;", line = 125)
	public Class290 method26053() {
		if (this.anArrayList3.isEmpty()) {
			return Class290.aClass290_4;
		}
		@Pc(13) Class290 local13 = ((Class241) this.anArrayList3.get(0)).method25979();
		switch(local13.anInt4005 * -1208833837) {
			case 1:
			case 3:
				return local13;
			default:
				@Pc(24) Iterator local24 = this.anArrayList3.iterator();
				@Pc(31) Class241 local31;
				do {
					if (!local24.hasNext()) {
						return Class290.aClass290_2;
					}
					local31 = (Class241) local24.next();
				} while (local31.method25979() != Class290.aClass290_4);
				return Class290.aClass290_4;
		}
	}

	@OriginalMember(owner = "client!fd", name = "s", descriptor = "(II)Lclient!fa;", line = 149)
	public Class241 method26054(@OriginalArg(0) int arg0) {
		return arg0 == -1 ? null : (Class241) this.anArrayList3.get(arg0);
	}

	@OriginalMember(owner = "client!fd", name = "ay", descriptor = "(I)Lclient!fa;", line = 149)
	public Class241 method26055(@OriginalArg(0) int arg0) {
		return arg0 == -1 ? null : (Class241) this.anArrayList3.get(arg0);
	}

	@OriginalMember(owner = "client!fd", name = "af", descriptor = "(I)Lclient!fa;", line = 149)
	public Class241 method26056(@OriginalArg(0) int arg0) {
		return arg0 == -1 ? null : (Class241) this.anArrayList3.get(arg0);
	}

	@OriginalMember(owner = "client!fd", name = "an", descriptor = "(I)Lclient!fa;", line = 149)
	public Class241 method26057(@OriginalArg(0) int arg0) {
		return arg0 == -1 ? null : (Class241) this.anArrayList3.get(arg0);
	}

	@OriginalMember(owner = "client!fd", name = "r", descriptor = "(I)Ljava/lang/String;", line = 154)
	public String method26058() {
		return this.aString173;
	}

	@OriginalMember(owner = "client!fd", name = "g", descriptor = "(I)Lclient!cq;", line = 158)
	public Interface18 method26059() {
		return new Class93(Class127.aClass127_67, this.aClass9_3);
	}

	@OriginalMember(owner = "client!fd", name = "aa", descriptor = "()Lclient!cq;", line = 158)
	public Interface18 method26060() {
		return new Class93(Class127.aClass127_67, this.aClass9_3);
	}

	@OriginalMember(owner = "client!fd", name = "ab", descriptor = "()Lclient!cq;", line = 158)
	public Interface18 method26061() {
		return new Class93(Class127.aClass127_67, this.aClass9_3);
	}

	@OriginalMember(owner = "client!fd", name = "ap", descriptor = "()Lclient!cq;", line = 158)
	public Interface18 method26062() {
		return new Class93(Class127.aClass127_67, this.aClass9_3);
	}

	@OriginalMember(owner = "client!fd", name = "aw", descriptor = "()Lclient!cq;", line = 158)
	public Interface18 method26063() {
		return new Class93(Class127.aClass127_67, this.aClass9_3);
	}

	@OriginalMember(owner = "client!fd", name = "az", descriptor = "(Lclient!fa;)V", line = 162)
	void method26064(@OriginalArg(0) Class241 arg0) {
		this.anArrayList3.add(arg0);
		this.method26044();
	}

	@OriginalMember(owner = "client!fd", name = "z", descriptor = "(Lclient!fa;I)V", line = 162)
	void method26065(@OriginalArg(0) Class241 arg0) {
		this.anArrayList3.add(arg0);
		this.method26044();
	}

	@OriginalMember(owner = "client!fd", name = "j", descriptor = "(IB)V", line = 167)
	void method26066(@OriginalArg(0) int arg0) {
		this.anArrayList3.remove(arg0);
		this.method26044();
	}

	@OriginalMember(owner = "client!fd", name = "bc", descriptor = "(I)V", line = 167)
	void method26067(@OriginalArg(0) int arg0) {
		this.anArrayList3.remove(arg0);
		this.method26044();
	}

	@OriginalMember(owner = "client!fd", name = "bj", descriptor = "(I)V", line = 167)
	void method26068(@OriginalArg(0) int arg0) {
		this.anArrayList3.remove(arg0);
		this.method26044();
	}

	@OriginalMember(owner = "client!fd", name = "ba", descriptor = "(I)V", line = 167)
	void method26069(@OriginalArg(0) int arg0) {
		this.anArrayList3.remove(arg0);
		this.method26044();
	}

	@OriginalMember(owner = "client!fd", name = "bv", descriptor = "(I)V", line = 167)
	void method26070(@OriginalArg(0) int arg0) {
		this.anArrayList3.remove(arg0);
		this.method26044();
	}

	@OriginalMember(owner = "client!fd", name = "i", descriptor = "(Lclient!fp;B)V", line = 172)
	void method26071(@OriginalArg(0) Class254 arg0) {
		this.anArrayList4.add(arg0);
	}

	@OriginalMember(owner = "client!fd", name = "bb", descriptor = "(Lclient!fp;)V", line = 172)
	void method26072(@OriginalArg(0) Class254 arg0) {
		this.anArrayList4.add(arg0);
	}

	@OriginalMember(owner = "client!fd", name = "bl", descriptor = "(Lclient!fp;)V", line = 172)
	void method26073(@OriginalArg(0) Class254 arg0) {
		this.anArrayList4.add(arg0);
	}

	@OriginalMember(owner = "client!fd", name = "al", descriptor = "(III)V", line = 172)
	public static void method26074(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class77_Sub1_Sub6 local9 = Class456.method29469(17, (long) arg1 << 32 | (long) arg0);
		local9.method21544();
	}

	@OriginalMember(owner = "client!fd", name = "k", descriptor = "(IB)V", line = 176)
	void method26075(@OriginalArg(0) int arg0) {
		this.anArrayList4.remove(arg0);
	}

	@OriginalMember(owner = "client!fd", name = "u", descriptor = "(III)V", line = 180)
	void method26076(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		((Class241) this.anArrayList3.get(arg0)).method25959(arg1);
		this.method26044();
	}

	@OriginalMember(owner = "client!fd", name = "bd", descriptor = "(II)V", line = 180)
	void method26077(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		((Class241) this.anArrayList3.get(arg0)).method25959(arg1);
		this.method26044();
	}

	@OriginalMember(owner = "client!fd", name = "by", descriptor = "(II)V", line = 180)
	void method26078(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		((Class241) this.anArrayList3.get(arg0)).method25959(arg1);
		this.method26044();
	}

	@OriginalMember(owner = "client!fd", name = "e", descriptor = "(III)V", line = 185)
	void method26079(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) Class241 local5 = (Class241) this.anArrayList3.get(arg0);
		local5.method25967(arg1);
		local5.method25974(true);
	}

	@OriginalMember(owner = "client!fd", name = "bx", descriptor = "(II)V", line = 185)
	void method26080(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) Class241 local5 = (Class241) this.anArrayList3.get(arg0);
		local5.method25967(arg1);
		local5.method25974(true);
	}

	@OriginalMember(owner = "client!fd", name = "bw", descriptor = "(II)V", line = 185)
	void method26081(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) Class241 local5 = (Class241) this.anArrayList3.get(arg0);
		local5.method25967(arg1);
		local5.method25974(true);
	}

	@OriginalMember(owner = "client!fd", name = "f", descriptor = "(II)V", line = 191)
	void method26082(@OriginalArg(0) int arg0) {
		@Pc(5) Class241 local5 = (Class241) this.anArrayList3.get(arg0);
		local5.method25974(false);
	}

	@OriginalMember(owner = "client!fd", name = "bi", descriptor = "(I)V", line = 191)
	void method26083(@OriginalArg(0) int arg0) {
		@Pc(5) Class241 local5 = (Class241) this.anArrayList3.get(arg0);
		local5.method25974(false);
	}

	@OriginalMember(owner = "client!fd", name = "bs", descriptor = "(IZ)V", line = 196)
	void method26084(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(5) Class241 local5 = (Class241) this.anArrayList3.get(arg0);
		local5.method25982(arg1 ? Class290.aClass290_2 : Class290.aClass290_4);
	}

	@OriginalMember(owner = "client!fd", name = "o", descriptor = "(IZI)V", line = 196)
	void method26085(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(5) Class241 local5 = (Class241) this.anArrayList3.get(arg0);
		local5.method25982(arg1 ? Class290.aClass290_2 : Class290.aClass290_4);
	}

	@OriginalMember(owner = "client!fd", name = "bg", descriptor = "(IZ)V", line = 196)
	void method26086(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(5) Class241 local5 = (Class241) this.anArrayList3.get(arg0);
		local5.method25982(arg1 ? Class290.aClass290_2 : Class290.aClass290_4);
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(IIB)V", line = 201)
	void method26087(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		((Class241) this.anArrayList3.get(arg0)).method25986(arg1);
	}

	@OriginalMember(owner = "client!fd", name = "n", descriptor = "(B)V", line = 205)
	void method26088() {
		@Pc(3) Iterator local3 = this.anArrayList3.iterator();
		while (local3.hasNext()) {
			@Pc(10) Class241 local10 = (Class241) local3.next();
			local10.method25982(Class290.aClass290_3);
		}
	}

	@OriginalMember(owner = "client!fd", name = "bt", descriptor = "()V", line = 205)
	void method26089() {
		@Pc(3) Iterator local3 = this.anArrayList3.iterator();
		while (local3.hasNext()) {
			@Pc(10) Class241 local10 = (Class241) local3.next();
			local10.method25982(Class290.aClass290_3);
		}
	}

	@OriginalMember(owner = "client!fd", name = "bf", descriptor = "()V", line = 214)
	void method26090() {
		@Pc(3) Iterator local3 = this.anArrayList3.iterator();
		while (local3.hasNext()) {
			@Pc(10) Class241 local10 = (Class241) local3.next();
			local10.method25982(Class290.aClass290_5);
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)V", line = 214)
	void method26091() {
		@Pc(3) Iterator local3 = this.anArrayList3.iterator();
		while (local3.hasNext()) {
			@Pc(10) Class241 local10 = (Class241) local3.next();
			local10.method25982(Class290.aClass290_5);
		}
	}

	@OriginalMember(owner = "client!fd", name = "bz", descriptor = "()V", line = 214)
	void method26092() {
		@Pc(3) Iterator local3 = this.anArrayList3.iterator();
		while (local3.hasNext()) {
			@Pc(10) Class241 local10 = (Class241) local3.next();
			local10.method25982(Class290.aClass290_5);
		}
	}

	@OriginalMember(owner = "client!fd", name = "bu", descriptor = "()V", line = 214)
	void method26093() {
		@Pc(3) Iterator local3 = this.anArrayList3.iterator();
		while (local3.hasNext()) {
			@Pc(10) Class241 local10 = (Class241) local3.next();
			local10.method25982(Class290.aClass290_5);
		}
	}

	@OriginalMember(owner = "client!fd", name = "bn", descriptor = "()V", line = 214)
	void method26094() {
		@Pc(3) Iterator local3 = this.anArrayList3.iterator();
		while (local3.hasNext()) {
			@Pc(10) Class241 local10 = (Class241) local3.next();
			local10.method25982(Class290.aClass290_5);
		}
	}

	@OriginalMember(owner = "client!fd", name = "bo", descriptor = "(ILclient!fa;)V", line = 223)
	void method26095(@OriginalArg(0) int arg0, @OriginalArg(1) Class241 arg1) {
		@Pc(5) Class241 local5 = (Class241) this.anArrayList3.get(arg0);
		local5.method25996(arg1);
	}

	@OriginalMember(owner = "client!fd", name = "m", descriptor = "(ILclient!fa;B)V", line = 223)
	void method26096(@OriginalArg(0) int arg0, @OriginalArg(1) Class241 arg1) {
		@Pc(5) Class241 local5 = (Class241) this.anArrayList3.get(arg0);
		local5.method25996(arg1);
	}

	@OriginalMember(owner = "client!fd", name = "bp", descriptor = "(ILclient!fa;)V", line = 223)
	void method26097(@OriginalArg(0) int arg0, @OriginalArg(1) Class241 arg1) {
		@Pc(5) Class241 local5 = (Class241) this.anArrayList3.get(arg0);
		local5.method25996(arg1);
	}

	@OriginalMember(owner = "client!fd", name = "bm", descriptor = "(ILclient!fa;)V", line = 223)
	void method26098(@OriginalArg(0) int arg0, @OriginalArg(1) Class241 arg1) {
		@Pc(5) Class241 local5 = (Class241) this.anArrayList3.get(arg0);
		local5.method25996(arg1);
	}

	@OriginalMember(owner = "client!fd", name = "af", descriptor = "(Lclient!dx;IIIIIIB)V", line = 1145)
	static void method26099(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		arg0.method19986(arg1, arg2, arg3, arg4, arg5);
		arg0.method19986(arg1 + 1, arg2 + 1, arg3 - 2, 16, arg6);
		arg0.method19982(arg1 + 1, arg2 + 18, arg3 - 2, arg4 - 19, arg6);
	}

	@OriginalMember(owner = "client!fd", name = "ye", descriptor = "(Lclient!yf;I)V", line = 9042)
	static final void method26100(@OriginalArg(0) Class665 arg0) {
		@Pc(13) String local13 = (String) arg0.anObjectArray45[(arg0.anInt5781 -= 1460193483) * 1485266147];
		if (local13.startsWith(Class152.method17433(0)) || local13.startsWith(Class152.method17433(1))) {
			local13 = local13.substring(7);
		}
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class440.method28948(local13);
	}

	@OriginalMember(owner = "client!fd", name = "aeq", descriptor = "(Lclient!yf;I)V", line = 9988)
	static final void method26101(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = ((Class18) Class537.aClass35_Sub7_1.method18319(local12)).anInt68 * 1996490023;
	}

	@OriginalMember(owner = "client!fd", name = "awj", descriptor = "(Lclient!yf;I)V", line = 13303)
	static final void method26102(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class35_Sub6.aClass77_Sub35_45.aClass143_Sub26_1.method16264(local12);
	}

	@OriginalMember(owner = "client!fd", name = "awb", descriptor = "(Lclient!yf;I)V", line = 13347)
	static final void method26103(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 0;
	}
}
