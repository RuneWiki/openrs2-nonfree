package com.jagex;

import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!abk")
public class Class35 implements Interface13 {

	@OriginalMember(owner = "client!abk", name = "p", descriptor = "Lclient!pw;")
	final Class478 aClass478_76;

	@OriginalMember(owner = "client!abk", name = "c", descriptor = "Lclient!xl;")
	final Class647 aClass647_32;

	@OriginalMember(owner = "client!abk", name = "y", descriptor = "Lclient!abg;")
	protected final Interface5 anInterface5_26;

	@OriginalMember(owner = "client!abk", name = "v", descriptor = "I")
	public int anInt2544;

	@OriginalMember(owner = "client!abk", name = "l", descriptor = "Lclient!er;")
	Class232 aClass232_62;

	@OriginalMember(owner = "client!abk", name = "<init>", descriptor = "(Lclient!ym;Lclient!yi;Lclient!pw;Lclient!xl;ILclient!abg;)V", line = 20)
	public Class35(@OriginalArg(0) Class670 arg0, @OriginalArg(1) Class667 arg1, @OriginalArg(2) Class478 arg2, @OriginalArg(3) Class647 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Interface5 arg5) {
		this.aClass478_76 = arg2;
		this.aClass647_32 = arg3;
		this.anInterface5_26 = arg5;
		this.anInt2544 = Class27.method470(this.aClass478_76, this.aClass647_32) * -1692351331;
		this.aClass232_62 = new Class232(arg4);
	}

	@OriginalMember(owner = "client!abk", name = "q", descriptor = "(Lclient!akv;I)Lclient!mq;", line = 24)
	public static Class118 method18320(@OriginalArg(0) Class77_Sub39 arg0) {
		@Pc(3) Class118 local3 = Class35_Sub19.method17775(arg0);
		@Pc(7) int local7 = arg0.method22549();
		@Pc(11) int local11 = arg0.method22549();
		@Pc(15) int local15 = arg0.method22549();
		@Pc(19) int local19 = arg0.method22549();
		@Pc(23) int local23 = arg0.method22549();
		@Pc(27) int local27 = arg0.method22549();
		return new Class118_Sub1(local3.aClass410_8, local3.aClass402_8, local3.anInt2926 * -2127596367, local3.anInt2920 * -1055236307, local3.anInt2922 * -1607607997, local3.anInt2923 * -228886179, local3.anInt2924 * -81046249, local3.anInt2925 * -120853723, local3.anInt2921 * 1210620409, local7, local11, local15, local19, local23, local27);
	}

	@OriginalMember(owner = "client!abk", name = "v", descriptor = "(I)Lclient!am;", line = 30)
	@Override
	public Interface12 method18315(@OriginalArg(0) int arg0) {
		@Pc(3) Class232 local3 = this.aClass232_62;
		@Pc(11) Interface12 local11;
		synchronized (this.aClass232_62) {
			local11 = (Interface12) this.aClass232_62.method25835((long) arg0);
		}
		if (local11 != null) {
			return local11;
		}
		local11 = this.method18322(arg0);
		local3 = this.aClass232_62;
		synchronized (this.aClass232_62) {
			this.aClass232_62.method25844(local11, (long) arg0);
			return local11;
		}
	}

	@OriginalMember(owner = "client!abk", name = "l", descriptor = "(I)Lclient!am;", line = 30)
	@Override
	public Interface12 method18314(@OriginalArg(0) int arg0) {
		@Pc(3) Class232 local3 = this.aClass232_62;
		@Pc(11) Interface12 local11;
		synchronized (this.aClass232_62) {
			local11 = (Interface12) this.aClass232_62.method25835((long) arg0);
		}
		if (local11 != null) {
			return local11;
		}
		local11 = this.method18322(arg0);
		local3 = this.aClass232_62;
		synchronized (this.aClass232_62) {
			this.aClass232_62.method25844(local11, (long) arg0);
			return local11;
		}
	}

	@OriginalMember(owner = "client!abk", name = "y", descriptor = "(I)Lclient!am;", line = 30)
	@Override
	public Interface12 method18317(@OriginalArg(0) int arg0) {
		@Pc(3) Class232 local3 = this.aClass232_62;
		@Pc(11) Interface12 local11;
		synchronized (this.aClass232_62) {
			local11 = (Interface12) this.aClass232_62.method25835((long) arg0);
		}
		if (local11 != null) {
			return local11;
		}
		local11 = this.method18322(arg0);
		local3 = this.aClass232_62;
		synchronized (this.aClass232_62) {
			this.aClass232_62.method25844(local11, (long) arg0);
			return local11;
		}
	}

	@OriginalMember(owner = "client!abk", name = "p", descriptor = "(II)Lclient!am;", line = 30)
	@Override
	public Interface12 method18319(@OriginalArg(0) int arg0) {
		@Pc(3) Class232 local3 = this.aClass232_62;
		@Pc(11) Interface12 local11;
		synchronized (this.aClass232_62) {
			local11 = (Interface12) this.aClass232_62.method25835((long) arg0);
		}
		if (local11 != null) {
			return local11;
		}
		local11 = this.method18322(arg0);
		local3 = this.aClass232_62;
		synchronized (this.aClass232_62) {
			this.aClass232_62.method25844(local11, (long) arg0);
			return local11;
		}
	}

	@OriginalMember(owner = "client!abk", name = "ai", descriptor = "(I)Lclient!am;", line = 43)
	Interface12 method18321(@OriginalArg(0) int arg0) {
		@Pc(3) Class478 local3 = this.aClass478_76;
		@Pc(12) byte[] local12;
		synchronized (this.aClass478_76) {
			local12 = Class598.method31978(this.aClass478_76, this.aClass647_32, arg0);
		}
		@Pc(27) Interface12 local27 = this.anInterface5_26.method27821(arg0, this);
		if (local12 != null) {
			local27.method36031(new Class77_Sub39(local12));
		}
		local27.method36034();
		return local27;
	}

	@OriginalMember(owner = "client!abk", name = "q", descriptor = "(II)Lclient!am;", line = 43)
	Interface12 method18322(@OriginalArg(0) int arg0) {
		@Pc(3) Class478 local3 = this.aClass478_76;
		@Pc(12) byte[] local12;
		synchronized (this.aClass478_76) {
			local12 = Class598.method31978(this.aClass478_76, this.aClass647_32, arg0);
		}
		@Pc(27) Interface12 local27 = this.anInterface5_26.method27821(arg0, this);
		if (local12 != null) {
			local27.method36031(new Class77_Sub39(local12));
		}
		local27.method36034();
		return local27;
	}

	@OriginalMember(owner = "client!abk", name = "h", descriptor = "(I)Lclient!am;", line = 43)
	Interface12 method18323(@OriginalArg(0) int arg0) {
		@Pc(3) Class478 local3 = this.aClass478_76;
		@Pc(12) byte[] local12;
		synchronized (this.aClass478_76) {
			local12 = Class598.method31978(this.aClass478_76, this.aClass647_32, arg0);
		}
		@Pc(27) Interface12 local27 = this.anInterface5_26.method27821(arg0, this);
		if (local12 != null) {
			local27.method36031(new Class77_Sub39(local12));
		}
		local27.method36034();
		return local27;
	}

	@OriginalMember(owner = "client!abk", name = "aj", descriptor = "(I)Lclient!am;", line = 43)
	Interface12 method18324(@OriginalArg(0) int arg0) {
		@Pc(3) Class478 local3 = this.aClass478_76;
		@Pc(12) byte[] local12;
		synchronized (this.aClass478_76) {
			local12 = Class598.method31978(this.aClass478_76, this.aClass647_32, arg0);
		}
		@Pc(27) Interface12 local27 = this.anInterface5_26.method27821(arg0, this);
		if (local12 != null) {
			local27.method36031(new Class77_Sub39(local12));
		}
		local27.method36034();
		return local27;
	}

	@OriginalMember(owner = "client!abk", name = "ag", descriptor = "(I)Lclient!am;", line = 43)
	Interface12 method18325(@OriginalArg(0) int arg0) {
		@Pc(3) Class478 local3 = this.aClass478_76;
		@Pc(12) byte[] local12;
		synchronized (this.aClass478_76) {
			local12 = Class598.method31978(this.aClass478_76, this.aClass647_32, arg0);
		}
		@Pc(27) Interface12 local27 = this.anInterface5_26.method27821(arg0, this);
		if (local12 != null) {
			local27.method36031(new Class77_Sub39(local12));
		}
		local27.method36034();
		return local27;
	}

	@OriginalMember(owner = "client!abk", name = "c", descriptor = "(B)I", line = 53)
	@Override
	public int method18318() {
		return this.anInt2544 * 888398261;
	}

	@OriginalMember(owner = "client!abk", name = "w", descriptor = "()I", line = 53)
	@Override
	public int method18313() {
		return this.anInt2544 * 888398261;
	}

	@OriginalMember(owner = "client!abk", name = "t", descriptor = "()I", line = 53)
	@Override
	public int method18316() {
		return this.anInt2544 * 888398261;
	}

	@OriginalMember(owner = "client!abk", name = "x", descriptor = "(II)V", line = 57)
	public void method18326(@OriginalArg(0) int arg0) {
		@Pc(3) Class232 local3 = this.aClass232_62;
		synchronized (this.aClass232_62) {
			this.aClass232_62.method25850();
			this.aClass232_62 = new Class232(arg0);
		}
	}

	@OriginalMember(owner = "client!abk", name = "al", descriptor = "(I)V", line = 57)
	public void method18327(@OriginalArg(0) int arg0) {
		@Pc(3) Class232 local3 = this.aClass232_62;
		synchronized (this.aClass232_62) {
			this.aClass232_62.method25850();
			this.aClass232_62 = new Class232(arg0);
		}
	}

	@OriginalMember(owner = "client!abk", name = "k", descriptor = "()V", line = 64)
	public void method18328() {
		@Pc(3) Class232 local3 = this.aClass232_62;
		synchronized (this.aClass232_62) {
			this.aClass232_62.method25850();
		}
	}

	@OriginalMember(owner = "client!abk", name = "j", descriptor = "()V", line = 64)
	public void method18329() {
		@Pc(3) Class232 local3 = this.aClass232_62;
		synchronized (this.aClass232_62) {
			this.aClass232_62.method25850();
		}
	}

	@OriginalMember(owner = "client!abk", name = "i", descriptor = "()V", line = 64)
	public void method18330() {
		@Pc(3) Class232 local3 = this.aClass232_62;
		synchronized (this.aClass232_62) {
			this.aClass232_62.method25850();
		}
	}

	@OriginalMember(owner = "client!abk", name = "d", descriptor = "(I)V", line = 64)
	public void method18331() {
		@Pc(3) Class232 local3 = this.aClass232_62;
		synchronized (this.aClass232_62) {
			this.aClass232_62.method25850();
		}
	}

	@OriginalMember(owner = "client!abk", name = "u", descriptor = "()V", line = 64)
	public void method18332() {
		@Pc(3) Class232 local3 = this.aClass232_62;
		synchronized (this.aClass232_62) {
			this.aClass232_62.method25850();
		}
	}

	@OriginalMember(owner = "client!abk", name = "g", descriptor = "(IS)V", line = 70)
	public void method18333(@OriginalArg(0) int arg0) {
		@Pc(3) Class232 local3 = this.aClass232_62;
		synchronized (this.aClass232_62) {
			this.aClass232_62.method25847(arg0);
		}
	}

	@OriginalMember(owner = "client!abk", name = "e", descriptor = "(I)V", line = 70)
	public void method18334(@OriginalArg(0) int arg0) {
		@Pc(3) Class232 local3 = this.aClass232_62;
		synchronized (this.aClass232_62) {
			this.aClass232_62.method25847(arg0);
		}
	}

	@OriginalMember(owner = "client!abk", name = "f", descriptor = "(I)V", line = 70)
	public void method18335(@OriginalArg(0) int arg0) {
		@Pc(3) Class232 local3 = this.aClass232_62;
		synchronized (this.aClass232_62) {
			this.aClass232_62.method25847(arg0);
		}
	}

	@OriginalMember(owner = "client!abk", name = "z", descriptor = "(I)V", line = 76)
	public void method18336() {
		@Pc(3) Class232 local3 = this.aClass232_62;
		synchronized (this.aClass232_62) {
			this.aClass232_62.method25857();
		}
	}

	@OriginalMember(owner = "client!abk", name = "o", descriptor = "()V", line = 76)
	public void method18337() {
		@Pc(3) Class232 local3 = this.aClass232_62;
		synchronized (this.aClass232_62) {
			this.aClass232_62.method25857();
		}
	}

	@OriginalMember(owner = "client!abk", name = "b", descriptor = "()V", line = 76)
	public void method18338() {
		@Pc(3) Class232 local3 = this.aClass232_62;
		synchronized (this.aClass232_62) {
			this.aClass232_62.method25857();
		}
	}

	@OriginalMember(owner = "client!abk", name = "n", descriptor = "()V", line = 76)
	public void method18339() {
		@Pc(3) Class232 local3 = this.aClass232_62;
		synchronized (this.aClass232_62) {
			this.aClass232_62.method25857();
		}
	}

	@OriginalMember(owner = "client!abk", name = "a", descriptor = "()V", line = 76)
	public void method18340() {
		@Pc(3) Class232 local3 = this.aClass232_62;
		synchronized (this.aClass232_62) {
			this.aClass232_62.method25857();
		}
	}

	@OriginalMember(owner = "client!abk", name = "m", descriptor = "()V", line = 76)
	public void method18341() {
		@Pc(3) Class232 local3 = this.aClass232_62;
		synchronized (this.aClass232_62) {
			this.aClass232_62.method25857();
		}
	}

	@OriginalMember(owner = "client!abk", name = "iterator", descriptor = "()Ljava/util/Iterator;", line = 82)
	@Override
	public Iterator iterator() {
		return new Class38(this);
	}

	@OriginalMember(owner = "client!abk", name = "r", descriptor = "()Ljava/util/Iterator;", line = 82)
	public Iterator method18342() {
		return new Class38(this);
	}

	@OriginalMember(owner = "client!abk", name = "s", descriptor = "()Ljava/util/Iterator;", line = 82)
	public Iterator method18343() {
		return new Class38(this);
	}

	@OriginalMember(owner = "client!abk", name = "aoi", descriptor = "(Lclient!yf;B)V", line = 12023)
	static final void method18344(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class589.anInt5497 * -241239087;
	}
}
