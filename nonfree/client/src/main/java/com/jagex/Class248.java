package com.jagex;

import java.util.ArrayList;
import java.util.List;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fi")
public class Class248 {

	@OriginalMember(owner = "client!fi", name = "p", descriptor = "I")
	static final int anInt3801 = 5;

	@OriginalMember(owner = "client!fi", name = "hc", descriptor = "Lclient!aoj;")
	public static Class35_Sub19 aClass35_Sub19_1;

	@OriginalMember(owner = "client!fi", name = "k", descriptor = "Lclient!dj;")
	public static Class94 aClass94_7;

	@OriginalMember(owner = "client!fi", name = "c", descriptor = "Ljava/util/List;")
	final List aList4 = new ArrayList();

	@OriginalMember(owner = "client!fi", name = "p", descriptor = "(I)I", line = 15)
	public int method26134() {
		return this.aList4.size();
	}

	@OriginalMember(owner = "client!fi", name = "q", descriptor = "()I", line = 15)
	public int method26135() {
		return this.aList4.size();
	}

	@OriginalMember(owner = "client!fi", name = "x", descriptor = "()I", line = 15)
	public int method26136() {
		return this.aList4.size();
	}

	@OriginalMember(owner = "client!fi", name = "d", descriptor = "()I", line = 15)
	public int method26137() {
		return this.aList4.size();
	}

	@OriginalMember(owner = "client!fi", name = "c", descriptor = "(Lclient!yf;B)V", line = 17)
	static void method26138(@OriginalArg(0) Class665 arg0) {
		arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = ((Class303) Class252.aClass42_Sub2_1.method18319(arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307])).aString190;
	}

	@OriginalMember(owner = "client!fi", name = "s", descriptor = "(I)I", line = 19)
	public int method26139(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.aList4.size(); local1++) {
			if (((Class264) this.aList4.get(local1)).anInt3825 * 279279007 == arg0) {
				return local1;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!fi", name = "c", descriptor = "(IB)I", line = 19)
	public int method26140(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.aList4.size(); local1++) {
			if (((Class264) this.aList4.get(local1)).anInt3825 * 279279007 == arg0) {
				return local1;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!fi", name = "v", descriptor = "(IB)Lclient!fz;", line = 26)
	public Class264 method26141(@OriginalArg(0) int arg0) {
		return (Class264) this.aList4.get(arg0);
	}

	@OriginalMember(owner = "client!fi", name = "r", descriptor = "(I)Lclient!fz;", line = 26)
	public Class264 method26142(@OriginalArg(0) int arg0) {
		return (Class264) this.aList4.get(arg0);
	}

	@OriginalMember(owner = "client!fi", name = "l", descriptor = "(Lclient!fz;I)I", line = 30)
	public int method26143(@OriginalArg(0) Class264 arg0) {
		return this.method26147(arg0, -1);
	}

	@OriginalMember(owner = "client!fi", name = "g", descriptor = "(Lclient!fz;)I", line = 30)
	public int method26144(@OriginalArg(0) Class264 arg0) {
		return this.method26147(arg0, -1);
	}

	@OriginalMember(owner = "client!fi", name = "z", descriptor = "(Lclient!fz;)I", line = 30)
	public int method26145(@OriginalArg(0) Class264 arg0) {
		return this.method26147(arg0, -1);
	}

	@OriginalMember(owner = "client!fi", name = "j", descriptor = "(Lclient!fz;)I", line = 30)
	public int method26146(@OriginalArg(0) Class264 arg0) {
		return this.method26147(arg0, -1);
	}

	@OriginalMember(owner = "client!fi", name = "y", descriptor = "(Lclient!fz;IB)I", line = 34)
	public int method26147(@OriginalArg(0) Class264 arg0, @OriginalArg(1) int arg1) {
		if (this.aList4.size() == 5) {
			throw new RuntimeException("");
		} else if (this.method26140(arg0.anInt3825 * 279279007) == -1) {
			if (arg1 == -1) {
				arg1 = this.aList4.size();
			}
			this.aList4.add(arg1, arg0);
			return arg1;
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!fi", name = "i", descriptor = "(Lclient!fz;I)I", line = 34)
	public int method26148(@OriginalArg(0) Class264 arg0, @OriginalArg(1) int arg1) {
		if (this.aList4.size() == 5) {
			throw new RuntimeException("");
		} else if (this.method26140(arg0.anInt3825 * 279279007) == -1) {
			if (arg1 == -1) {
				arg1 = this.aList4.size();
			}
			this.aList4.add(arg1, arg0);
			return arg1;
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!fi", name = "w", descriptor = "(II)V", line = 42)
	public void method26149(@OriginalArg(0) int arg0) {
		this.aList4.remove(arg0);
	}

	@OriginalMember(owner = "client!fi", name = "k", descriptor = "(I)V", line = 42)
	public void method26150(@OriginalArg(0) int arg0) {
		this.aList4.remove(arg0);
	}

	@OriginalMember(owner = "client!fi", name = "t", descriptor = "(I)V", line = 46)
	public void method26151() {
		this.aList4.clear();
	}

	@OriginalMember(owner = "client!fi", name = "e", descriptor = "()V", line = 46)
	public void method26152() {
		this.aList4.clear();
	}

	@OriginalMember(owner = "client!fi", name = "u", descriptor = "()V", line = 46)
	public void method26153() {
		this.aList4.clear();
	}

	@OriginalMember(owner = "client!fi", name = "q", descriptor = "(II)V", line = 329)
	public static void method26154(@OriginalArg(0) int arg0) {
		Class280.aBooleanArray22[arg0] = false;
		Class677.method36017(arg0);
	}

	@OriginalMember(owner = "client!fi", name = "eo", descriptor = "(Lclient!yf;I)V", line = 5235)
	static final void method26155(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		@Pc(22) Class273 local22 = Class35_Sub11.aClass273Array1[local12 >> 16];
		Class184.method24600(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!fi", name = "jg", descriptor = "(IIIIIB)I", line = 6289)
	public static final int method26156(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (client.aClass517_1.method30435() == null) {
			return 0;
		}
		if (arg4 < 3) {
			@Pc(12) Class474 local12 = client.aClass517_1.method30441();
			@Pc(16) int local16 = arg0 >> 9;
			@Pc(20) int local20 = arg1 >> 9;
			if (arg2 < 0 || arg3 < 0 || arg2 > client.aClass517_1.method30411() - 1 || arg3 > client.aClass517_1.method30417() - 1) {
				return 0;
			}
			if (local16 < 1 || local20 < 1 || local16 > client.aClass517_1.method30411() - 1 || local20 > client.aClass517_1.method30417() - 1) {
				return 0;
			}
			@Pc(81) boolean local81 = (local12.aByteArrayArrayArray13[1][arg0 >> 9][arg1 >> 9] & 0x2) != 0;
			@Pc(105) boolean local105;
			@Pc(122) boolean local122;
			if ((arg0 & 0x1FF) == 0) {
				local105 = (local12.aByteArrayArrayArray13[1][local16 - 1][arg1 >> 9] & 0x2) != 0;
				local122 = (local12.aByteArrayArrayArray13[1][local16][arg1 >> 9] & 0x2) != 0;
				if (local122 != local105) {
					local81 = (local12.aByteArrayArrayArray13[1][arg2][arg3] & 0x2) != 0;
				}
			}
			if ((arg1 & 0x1FF) == 0) {
				local105 = (local12.aByteArrayArrayArray13[1][arg0 >> 9][local20 - 1] & 0x2) != 0;
				local122 = (local12.aByteArrayArrayArray13[1][arg0 >> 9][local20] & 0x2) != 0;
				if (local105 != local122) {
					local81 = (local12.aByteArrayArrayArray13[1][arg2][arg3] & 0x2) != 0;
				}
			}
			if (local81) {
				arg4++;
			}
		}
		return client.aClass517_1.method30435().aClass88Array1[arg4].method5493(arg0, arg1);
	}

	@OriginalMember(owner = "client!fi", name = "qs", descriptor = "(Lclient!yf;I)V", line = 7526)
	static final void method26157(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		@Pc(24) int local24 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(30) Class67 local30 = (Class67) Class77_Sub13_Sub12.aClass35_Sub22_1.method18319(local24);
		if (local30.method968()) {
			arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = local11.method26640(local24, local30.aString13);
		} else {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local11.method26638(local24, local30.anInt198 * 263946597);
		}
	}

	@OriginalMember(owner = "client!fi", name = "anm", descriptor = "(Lclient!yf;I)V", line = 11902)
	static final void method26158(@OriginalArg(0) Class665 arg0) {
		Class304.method27234();
	}

	@OriginalMember(owner = "client!fi", name = "aum", descriptor = "(Lclient!yf;I)V", line = 13069)
	static final void method26159(@OriginalArg(0) Class665 arg0) {
		Class368.method28211();
		Class209.method25586();
		client.aClass517_1.method30486();
		Class667.method33150();
		client.aBoolean593 = false;
	}
}
