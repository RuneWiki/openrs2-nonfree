import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!da")
public final class da extends Class9 implements Interface4 {

	@OriginalMember(owner = "client!da", name = "p", descriptor = "Lclient!a;")
	private a anA1;

	@OriginalMember(owner = "client!da", name = "D", descriptor = "Lclient!q;")
	private Class8 aClass8_3;

	@OriginalMember(owner = "client!da", name = "F", descriptor = "Lclient!v;")
	private v aV1;

	@OriginalMember(owner = "client!da", name = "K", descriptor = "[Lclient!t;")
	private t[] aTArray1;

	@OriginalMember(owner = "client!da", name = "M", descriptor = "I")
	private int anInt1951;

	@OriginalMember(owner = "client!da", name = "nativeid", descriptor = "J")
	private final long nativeid = 0L;

	@OriginalMember(owner = "client!da", name = "A", descriptor = "Z")
	private boolean aBoolean190 = false;

	@OriginalMember(owner = "client!da", name = "q", descriptor = "Lclient!mfa;")
	private final Class211 aClass211_18 = new Class211();

	@OriginalMember(owner = "client!da", name = "E", descriptor = "I")
	private final int anInt1949 = 4096;

	@OriginalMember(owner = "client!da", name = "I", descriptor = "I")
	private final int anInt1950 = 4096;

	@OriginalMember(owner = "client!da", name = "H", descriptor = "Lclient!tq;")
	private final Class305 aClass305_12 = new Class305(4);

	@OriginalMember(owner = "client!da", name = "J", descriptor = "Z")
	private boolean aBoolean191 = false;

	@OriginalMember(owner = "client!da", name = "G", descriptor = "Lclient!q;")
	private Class8 aClass8_4;

	@OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!e;)V")
	public da(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface2 arg1) {
		super(arg1);
		try {
			if (!Static234.method4121("sw3d")) {
				throw new RuntimeException("");
			}
			Static411.method6420();
			this.PA(super.anInterface2_11, 0, 0);
			Static361.method5811(true, false);
			this.aBoolean191 = true;
			this.aClass8_4 = new wa();
			this.method5429(new wa());
			this.method5394(1);
			this.method5459(0);
			if (arg0 != null) {
				this.method5428(arg0);
				this.method5465(arg0);
			}
		} catch (@Pc(78) Throwable local78) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5410(@OriginalArg(0) Canvas arg0) {
		if (this.aV1.aCanvas14 == arg0) {
			this.method5465(null);
		}
		@Pc(16) v local16 = (v) this.aClass305_12.method7447((long) arg0.hashCode());
		if (local16 != null) {
			local16.method8151();
			local16.method7724();
		}
	}

	@OriginalMember(owner = "client!da", name = "A", descriptor = "([I)V")
	public native void A(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!da", name = "r", descriptor = "()Z")
	@Override
	public boolean method5439() {
		return false;
	}

	@OriginalMember(owner = "client!da", name = "w", descriptor = "()Z")
	@Override
	public boolean method5447() {
		return true;
	}

	@OriginalMember(owner = "client!da", name = "KA", descriptor = "(IIII)[I")
	public native int[] KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!da", name = "AA", descriptor = "(IIII)V")
	public native void AA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIZ)Lclient!xa;")
	@Override
	public Class66 method5454(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return arg4 ? new aa(this, this.anA1, arg0, arg1, arg2, arg3) : new ja(this, this.anA1, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!da", name = "c", descriptor = "()V")
	@Override
	public void method5406() {
	}

	@OriginalMember(owner = "client!da", name = "ma", descriptor = "(IIIIII[BII)V")
	public native void ma(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(II[[I[[IIII)Lclient!d;")
	@Override
	public Class62 method5415(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new ya(this, this.anA1, arg0, arg1, arg2, arg3, 512, arg4, arg5);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!tg;)V")
	@Override
	public void method5433(@OriginalArg(0) Class299 arg0) {
		this.method1797(arg0, false);
		this.method1799().WA(this, Static80.anIntArray138, Static80.anIntArray139, Static80.anIntArray142, Static80.aShortArray26, arg0.aClass272_1.method6596());
	}

	@OriginalMember(owner = "client!da", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5465(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			this.aV1 = null;
			this.P(null);
		} else {
			@Pc(10) v local10 = (v) this.aClass305_12.method7447((long) arg0.hashCode());
			this.aV1 = local10;
			this.P(local10);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method5448(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		if (this.aV1 == null) {
			throw new IllegalStateException("off");
		}
		this.aV1.method7723(arg0, arg1);
	}

	@OriginalMember(owner = "client!da", name = "C", descriptor = "(IIIIII)V")
	public native void C(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!i;)V")
	private native void a(@OriginalArg(0) Class6_Sub25 arg0);

	@OriginalMember(owner = "client!da", name = "g", descriptor = "(I)V")
	@Override
	public void method5459(@OriginalArg(0) int arg0) {
		this.aTArray1[arg0].method7319();
	}

	@OriginalMember(owner = "client!da", name = "c", descriptor = "(I)V")
	private native void c(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!dga;Lclient!dga;FLclient!dga;)Lclient!dga;")
	@Override
	public Class65 method5402(@OriginalArg(0) Class65 arg0, @OriginalArg(1) Class65 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class65 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!da", name = "z", descriptor = "()Z")
	@Override
	public boolean method5453() {
		return false;
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(Lclient!i;)V")
	@Override
	public void method5451(@OriginalArg(0) Class6_Sub25 arg0) {
		this.anA1 = (a) arg0;
		this.a(arg0);
	}

	@OriginalMember(owner = "client!da", name = "d", descriptor = "(Z)V")
	@Override
	public void method5432(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(SBBZZZBBBIIZZ)V")
	private native void b(@OriginalArg(0) short arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) boolean arg12);

	@OriginalMember(owner = "client!da", name = "h", descriptor = "()V")
	@Override
	protected void method5418() {
		if (this.aBoolean190) {
			return;
		}
		this.aTArray1 = null;
		this.aV1 = null;
		this.anA1 = null;
		this.aClass8_4 = null;
		this.aClass305_12.method7440();
		for (@Pc(25) a local25 = (a) this.aClass211_18.method5183(); local25 != null; local25 = (a) this.aClass211_18.method5177()) {
			local25.ZA();
		}
		this.aClass211_18.method5179();
		this.fa();
		if (this.aBoolean191) {
			Static30.method995(true, false);
			this.aBoolean191 = false;
		}
		this.method1798();
		Static411.method6419();
		this.aBoolean190 = true;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIII)V")
	@Override
	public void method5466(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!da", name = "g", descriptor = "()Lclient!q;")
	@Override
	public Class8 method5417() {
		return this.aClass8_4;
	}

	@OriginalMember(owner = "client!da", name = "p", descriptor = "()Lclient!hl;")
	@Override
	public Class138 method5435() {
		return new Class138(0, "SSE", 1, "CPU", 0L);
	}

	@OriginalMember(owner = "client!da", name = "LA", descriptor = "(IIII)V")
	public native void LA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method5396() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!ba;Lclient!tg;Lclient!q;Lclient!mr;I)V")
	@Override
	public void method5457(@OriginalArg(0) Class23 arg0, @OriginalArg(1) Class299 arg1, @OriginalArg(2) Class8 arg2, @OriginalArg(3) Class5_Sub4 arg3, @OriginalArg(4) int arg4) {
		this.method1797(arg1, true);
		if (arg3 == null) {
			this.method1799().m(this, arg0, arg2, null, arg4, Static80.anIntArray138, Static80.anIntArray139, Static80.anIntArray142, Static80.aShortArray26, Static80.aByteArray38, arg1.aClass272_1.method6596(), Static80.anIntArray140);
			return;
		}
		Static80.anIntArray141[5] = 0;
		this.method1799().m(this, arg0, arg2, Static80.anIntArray141, arg4, Static80.anIntArray138, Static80.anIntArray139, Static80.anIntArray142, Static80.aShortArray26, Static80.aByteArray38, arg1.aClass272_1.method6596(), Static80.anIntArray140);
		arg3.anInt6180 = Static80.anIntArray141[0];
		arg3.anInt6177 = Static80.anIntArray141[1];
		arg3.anInt6178 = Static80.anIntArray141[2];
		arg3.anInt6179 = Static80.anIntArray141[3];
		arg3.anInt6181 = Static80.anIntArray141[4];
		arg3.aBoolean456 = Static80.anIntArray141[5] != 0;
	}

	@OriginalMember(owner = "client!da", name = "v", descriptor = "()I")
	public native int v();

	@OriginalMember(owner = "client!da", name = "PA", descriptor = "(Lclient!e;II)V")
	private native void PA(@OriginalArg(0) Interface2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!da", name = "f", descriptor = "(I)V")
	@Override
	public void method5438(@OriginalArg(0) int arg0) {
		Static411.method6417();
		this.c(arg0);
		for (@Pc(10) a local10 = (a) this.aClass211_18.method5183(); local10 != null; local10 = (a) this.aClass211_18.method5177()) {
			local10.P();
		}
	}

	@OriginalMember(owner = "client!da", name = "i", descriptor = "()V")
	@Override
	public void method5419() {
	}

	@OriginalMember(owner = "client!da", name = "finalize", descriptor = "()V")
	@Override
	public synchronized void finalize() {
		this.method5390();
		if (this.nativeid != 0L) {
			Static411.method6421(this);
		}
	}

	@OriginalMember(owner = "client!da", name = "m", descriptor = "(IIII)V")
	public native void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V")
	@Override
	public void method5392(@OriginalArg(0) int arg0) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!da", name = "d", descriptor = "(I)Lclient!i;")
	@Override
	public Class6_Sub25 method5421(@OriginalArg(0) int arg0) {
		@Pc(5) a local5 = new a(this, arg0);
		this.aClass211_18.method5173(local5);
		return local5;
	}

	@OriginalMember(owner = "client!da", name = "fa", descriptor = "()V")
	private native void fa();

	@OriginalMember(owner = "client!da", name = "b", descriptor = "()Z")
	@Override
	public boolean method5398() {
		return false;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public void method5429(@OriginalArg(0) Class8 arg0) {
		this.aClass8_3 = arg0;
		this.o(arg0);
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(II)I")
	@Override
	public int method5468(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 & 0xFFFFF;
		@Pc(7) int local7 = arg1 & 0xFFFFF;
		return local3 & local7 ^ local7;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIILclient!fa;II)V")
	@Override
	public void method5456(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class19 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		this.ra(arg0, arg1, arg2, arg3, arg4, 1, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!da", name = "ca", descriptor = "(IIII)V")
	public native void ca(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!da", name = "A", descriptor = "()Z")
	@Override
	public boolean method5458() {
		return false;
	}

	@OriginalMember(owner = "client!da", name = "y", descriptor = "()Z")
	@Override
	public boolean method5452() {
		return true;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(FFF)V")
	@Override
	public void method5443(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!da", name = "HA", descriptor = "()Ljava/lang/Object;")
	private Object method1795() {
		return new pa(this);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIF)Lclient!od;")
	@Override
	public Class6_Sub29 method5424(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class6_Sub29_Sub3(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!da", name = "YA", descriptor = "(IFFFFF)V")
	public native void YA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!da", name = "IA", descriptor = "()I")
	public native int IA();

	@OriginalMember(owner = "client!da", name = "e", descriptor = "(I)V")
	@Override
	public void method5426(@OriginalArg(0) int arg0) {
		this.aTArray1[arg0].method7318();
	}

	@OriginalMember(owner = "client!da", name = "q", descriptor = "()Z")
	@Override
	public boolean method5437() {
		return true;
	}

	@OriginalMember(owner = "client!da", name = "t", descriptor = "()V")
	@Override
	public void method5441() {
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5403(@OriginalArg(0) Canvas arg0) {
		@Pc(8) v local8 = (v) this.aClass305_12.method7447((long) arg0.hashCode());
		@Pc(11) Dimension local11 = arg0.getSize();
		local8.D(arg0, local11.width, local11.height);
		if (arg0 != null && arg0 == this.aV1.aCanvas14) {
			this.method5465(arg0);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([IIIII)Lclient!xa;")
	@Override
	public Class66 method5423(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(1) boolean local1 = false;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < arg3; local5++) {
			for (@Pc(8) int local8 = 0; local8 < arg2; local8++) {
				@Pc(16) int local16 = arg0[local3++] >>> 24;
				if (local16 != 0 && local16 != 255) {
					local1 = true;
					return local1 ? new aa(this, this.anA1, arg0, 0, arg1, arg2, arg3) : new ja(this, this.anA1, arg0, 0, arg1, arg2, arg3);
				}
			}
		}
		return local1 ? new aa(this, this.anA1, arg0, 0, arg1, arg2, arg3) : new ja(this, this.anA1, arg0, 0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!da", name = "qa", descriptor = "(S)Z")
	private boolean method1796(@OriginalArg(0) short arg0) {
		synchronized (this) {
			@Pc(9) Class296 local9 = super.anInterface2_11.method3585(arg0);
			if (local9 == null) {
				return false;
			} else {
				this.b(arg0, local9.aByte103, local9.aByte101, local9.aBoolean652, local9.aBoolean656, local9.aBoolean660, local9.aByte105, local9.aByte107, local9.aByte104, local9.aShort125, local9.anInt8779, local9.aBoolean658, local9.aBoolean655);
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "L", descriptor = "(ILclient!fa;II)V")
	public native void L(@OriginalArg(0) int arg0, @OriginalArg(1) Class19 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!da", name = "e", descriptor = "(Z)V")
	@Override
	public void method5455(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!da", name = "Q", descriptor = "(IIII)V")
	public native void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!da", name = "na", descriptor = "(III[I)V")
	public native void na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!da", name = "f", descriptor = "()Z")
	@Override
	public boolean method5414() {
		return true;
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(I)V")
	@Override
	public void method5394(@OriginalArg(0) int arg0) {
		this.anInt1951 = arg0;
		this.aTArray1 = new t[this.anInt1951];
		for (@Pc(9) int local9 = 0; local9 < this.anInt1951; local9++) {
			this.aTArray1[local9] = new t(this, this.anInt1949, this.anInt1950);
		}
	}

	@OriginalMember(owner = "client!da", name = "c", descriptor = "(IIIIII)V")
	@Override
	public void method5436(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.e(arg0, arg1, arg2, arg4, arg5);
		this.e(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.ya(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
		this.ya(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
	}

	@OriginalMember(owner = "client!da", name = "J", descriptor = "(SBBZZZBBBIIZZ[I)V")
	private native void J(@OriginalArg(0) short arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) int[] arg13);

	@OriginalMember(owner = "client!da", name = "D", descriptor = "()Z")
	@Override
	public boolean method5464() {
		return false;
	}

	@OriginalMember(owner = "client!da", name = "U", descriptor = "()I")
	public native int U();

	@OriginalMember(owner = "client!da", name = "l", descriptor = "()Z")
	@Override
	public boolean method5422() {
		return false;
	}

	@OriginalMember(owner = "client!da", name = "k", descriptor = "()V")
	public native void k();

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!tg;Z)V")
	private void method1797(@OriginalArg(0) Class299 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		for (@Pc(15) Class5_Sub1_Sub1 local15 = (Class5_Sub1_Sub1) arg0.aClass272_1.method6599(); local15 != null; local15 = (Class5_Sub1_Sub1) arg0.aClass272_1.method6597()) {
			Static80.anIntArray138[local1++] = local15.anInt6014;
			Static80.anIntArray138[local1++] = local15.anInt6009;
			Static80.anIntArray138[local1++] = local15.anInt6011;
			Static80.anIntArray139[local3++] = local15.anInt6015;
			Static80.aShortArray26[local7++] = (short) local15.anInt6013;
			Static80.anIntArray142[local5++] = local15.anInt6007;
			if (arg1) {
				Static80.aByteArray38[local9++] = local15.aByte55;
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "e", descriptor = "()V")
	@Override
	public void method5411() throws Exception_Sub1 {
		if (this.aV1 == null) {
			throw new IllegalStateException("off");
		}
		this.aV1.method7726();
	}

	@OriginalMember(owner = "client!da", name = "sa", descriptor = "(II)V")
	public native void sa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!da", name = "D", descriptor = "(I)V")
	public native void D(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!da", name = "ya", descriptor = "(IIIII)V")
	public native void ya(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!da", name = "H", descriptor = "(Z)V")
	public native void H(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!da", name = "SA", descriptor = "()I")
	public native int SA();

	@OriginalMember(owner = "client!da", name = "c", descriptor = "(Z)V")
	@Override
	public void method5413(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!da", name = "j", descriptor = "()V")
	@Override
	public void method5420() {
	}

	@OriginalMember(owner = "client!da", name = "o", descriptor = "(Lclient!q;)V")
	private native void o(@OriginalArg(0) Class8 arg0);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!ed;[Lclient!aaa;Z)Lclient!ta;")
	@Override
	public Class73 method5393(@OriginalArg(0) Class82 arg0, @OriginalArg(1) Class1[] arg1) {
		@Pc(3) int[] local3 = new int[arg1.length];
		@Pc(7) int[] local7 = new int[arg1.length];
		@Pc(9) boolean local9 = false;
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			local3[local11] = arg1[local11].anInt27;
			local7[local11] = arg1[local11].anInt30;
			if (arg1[local11].aByteArray1 != null) {
				local9 = true;
			}
		}
		if (local9) {
			throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
		}
		return new b(this, this.anA1, arg0, arg1, null);
	}

	@OriginalMember(owner = "client!da", name = "ra", descriptor = "(IIIIIILclient!fa;II)V")
	private native void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class19 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!aaa;Z)Lclient!xa;")
	@Override
	public Class66 method5412(@OriginalArg(0) Class1 arg0) {
		@Pc(2) int[] local2 = arg0.anIntArray6;
		@Pc(5) byte[] local5 = arg0.aByteArray2;
		@Pc(8) int local8 = arg0.anInt27;
		@Pc(11) int local11 = arg0.anInt30;
		@Pc(32) Class66 local32;
		if (arg0.aByteArray1 == null) {
			local32 = new la(this, this.anA1, local2, local5, 0, arg0.anInt27, arg0.anInt27, arg0.anInt30);
		} else {
			@Pc(37) int local37 = local8 * local11;
			@Pc(40) int[] local40 = new int[local37];
			@Pc(43) byte[] local43 = arg0.aByteArray1;
			@Pc(52) int local52;
			@Pc(54) int local54;
			if (local43 == null) {
				@Pc(100) boolean local100 = false;
				for (local52 = 0; local52 < local37; local52++) {
					local54 = arg0.anIntArray6[local5[local52] & 0xFF];
					if (local54 >>> 24 != 255) {
						local100 = true;
					}
					local40[local52] = local54;
				}
				if (local100) {
					local32 = new aa(this, this.anA1, local40, 0, arg0.anInt27, arg0.anInt27, arg0.anInt30);
				} else {
					local32 = new ja(this, this.anA1, local40, 0, arg0.anInt27, arg0.anInt27, arg0.anInt30);
				}
			} else {
				for (@Pc(47) int local47 = 0; local47 < local11; local47++) {
					local52 = local47 * local8;
					for (local54 = 0; local54 < local8; local54++) {
						local40[local52 + local54] = local2[local5[local52 + local54] & 0xFF] | local43[local52 + local54] << 24;
					}
				}
				local32 = new aa(this, this.anA1, local40, 0, local8, local8, local11);
			}
		}
		local32.EA(arg0.anInt29, arg0.anInt31, arg0.anInt28, arg0.anInt26);
		return local32;
	}

	@OriginalMember(owner = "client!da", name = "m", descriptor = "()I")
	@Override
	public int method5427() {
		return 4;
	}

	@OriginalMember(owner = "client!da", name = "e", descriptor = "(IIIIII)V")
	@Override
	public void method5450(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.BA(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method5399(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method1799().IA(this, arg0, arg1, arg2, arg3, arg4, arg5, 0);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(I[Lclient!od;)V")
	@Override
	public void method5401(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub29[] arg1) {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			Static80.anIntArray137[local1++] = arg1[local3].method6164();
			Static80.anIntArray137[local1++] = arg1[local3].method6161();
			Static80.anIntArray137[local1++] = arg1[local3].method6165();
			Static80.anIntArray137[local1++] = arg1[local3].method6160();
			Static80.aFloatArray7[local3] = arg1[local3].method6158();
			Static80.anIntArray137[local1++] = arg1[local3].method6157();
		}
		this.f(arg0, Static80.anIntArray137, Static80.aFloatArray7);
	}

	@OriginalMember(owner = "client!da", name = "f", descriptor = "(I[I[F)V")
	private native void f(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) float[] arg2);

	@OriginalMember(owner = "client!da", name = "FA", descriptor = "(IIIIII)Z")
	public native boolean FA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!da", name = "n", descriptor = "()V")
	@Override
	public void method5430() {
	}

	@OriginalMember(owner = "client!da", name = "s", descriptor = "()V")
	private void method1798() {
		System.gc();
		System.runFinalization();
		Static411.method6417();
	}

	@OriginalMember(owner = "client!da", name = "x", descriptor = "()Z")
	@Override
	public boolean method5449() {
		return true;
	}

	@OriginalMember(owner = "client!da", name = "e", descriptor = "(IIIII)V")
	public native void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(II[I[I)Lclient!fa;")
	@Override
	public Class19 method5460(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new f(this, this.anA1, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!da", name = "X", descriptor = "(III)V")
	public native void X(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!da", name = "E", descriptor = "()Lclient!t;")
	public t method1799() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1951; local1++) {
			if (this.aTArray1[local1].aRunnable4 == Thread.currentThread()) {
				return this.aTArray1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!da", name = "d", descriptor = "(IIIIII)Lclient!dga;")
	@Override
	public Class65 method5442(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!da", name = "ka", descriptor = "(FF)V")
	public native void ka(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!da", name = "C", descriptor = "()V")
	@Override
	public void method5463() {
	}

	@OriginalMember(owner = "client!da", name = "ha", descriptor = "(F)V")
	public native void ha(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!da", name = "JA", descriptor = "(I)V")
	public native void JA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!da", name = "h", descriptor = "(IIIII)V")
	protected native void h(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!da", name = "u", descriptor = "()Lclient!q;")
	@Override
	public Class8 method5446() {
		return new wa();
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(II)I")
	@Override
	public int method5416(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([Lclient!ba;Lclient!tg;Lclient!q;[Lclient!mr;I)V")
	@Override
	public void method5445(@OriginalArg(0) Class23[] arg0, @OriginalArg(1) Class299 arg1, @OriginalArg(2) Class8 arg2, @OriginalArg(3) Class5_Sub4[] arg3, @OriginalArg(4) int arg4) {
		this.method1797(arg1, true);
		if (arg3 == null) {
			this.method1799().v(this, arg0, arg2, null, arg4, Static80.anIntArray138, Static80.anIntArray139, Static80.anIntArray142, Static80.aShortArray26, Static80.aByteArray38, arg1.aClass272_1.method6596(), Static80.anIntArray140);
		} else {
			@Pc(28) Class5_Sub4 local28 = arg3[0];
			Static80.anIntArray141[5] = 0;
			this.method1799().v(this, arg0, arg2, Static80.anIntArray141, arg4, Static80.anIntArray138, Static80.anIntArray139, Static80.anIntArray142, Static80.aShortArray26, Static80.aByteArray38, arg1.aClass272_1.method6596(), Static80.anIntArray140);
			local28.anInt6180 = Static80.anIntArray141[0];
			local28.anInt6177 = Static80.anIntArray141[1];
			local28.anInt6178 = Static80.anIntArray141[2];
			local28.anInt6179 = Static80.anIntArray141[3];
			local28.anInt6181 = Static80.anIntArray141[4];
			local28.aBoolean456 = Static80.anIntArray141[5] != 0;
		}
		for (@Pc(86) int local86 = 0; local86 < arg0.length; local86++) {
			if (arg0[local86] != null) {
				@Pc(96) j local96 = (j) arg0[local86];
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5428(@OriginalArg(0) Canvas arg0) {
		@Pc(8) v local8 = (v) this.aClass305_12.method7447((long) arg0.hashCode());
		if (local8 != null) {
			return;
		}
		try {
			@Pc(13) Class local13 = Class.forName("java.awt.Canvas");
			@Pc(23) Method local23 = local13.getMethod("setIgnoreRepaint", Boolean.TYPE);
			local23.invoke(arg0, Boolean.TRUE);
		} catch (@Pc(35) Exception local35) {
		}
		local8 = new v(this, arg0);
		this.aClass305_12.method7448((long) arg0.hashCode(), local8);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!qda;IIII)Lclient!ba;")
	@Override
	public Class23 method5404(@OriginalArg(0) Class260 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new j(this, this.anA1, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!da", name = "o", descriptor = "()Z")
	@Override
	public boolean method5431() {
		return true;
	}

	@OriginalMember(owner = "client!da", name = "d", descriptor = "()Z")
	@Override
	public boolean method5407() {
		return false;
	}

	@OriginalMember(owner = "client!da", name = "F", descriptor = "()V")
	public native void F();

	@OriginalMember(owner = "client!da", name = "P", descriptor = "(Lclient!v;)V")
	private native void P(@OriginalArg(0) v arg0);

	@OriginalMember(owner = "client!da", name = "B", descriptor = "()Z")
	@Override
	public boolean method5462() {
		return true;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([Lclient!ba;Lclient!q;[Lclient!mr;I)V")
	@Override
	public void method5408(@OriginalArg(0) Class23[] arg0, @OriginalArg(1) Class8 arg1, @OriginalArg(2) Class5_Sub4[] arg2, @OriginalArg(3) int arg3) {
		if (arg2 == null) {
			this.method1799().n(this, arg0, arg1, null, -1, arg3);
			return;
		}
		@Pc(15) Class5_Sub4 local15 = arg2[0];
		Static80.anIntArray141[5] = 0;
		this.method1799().n(this, arg0, arg1, Static80.anIntArray141, -1, arg3);
		local15.anInt6180 = Static80.anIntArray141[0];
		local15.anInt6177 = Static80.anIntArray141[1];
		local15.anInt6178 = Static80.anIntArray141[2];
		local15.anInt6179 = Static80.anIntArray141[3];
		local15.anInt6181 = Static80.anIntArray141[4];
		local15.aBoolean456 = Static80.anIntArray141[5] != 0;
	}

	@OriginalMember(owner = "client!da", name = "BA", descriptor = "(IIIIII)V")
	private native void BA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!da", name = "d", descriptor = "(S)Z")
	private boolean method1800(@OriginalArg(0) short arg0) {
		@Pc(2) Interface2 local2 = super.anInterface2_11;
		synchronized (super.anInterface2_11) {
			if (!super.anInterface2_11.method3583(arg0)) {
				return false;
			}
			@Pc(22) Class296 local22 = super.anInterface2_11.method3585(arg0);
			if (local22 == null) {
				return false;
			}
			@Pc(43) int[] local43;
			if (local22.aBoolean659) {
				local43 = super.anInterface2_11.method3581(arg0, 0.7F, 128, 128);
			} else {
				local43 = super.anInterface2_11.method3582(0.7F, true, 128, arg0, 128);
			}
			this.J(arg0, local22.aByte103, local22.aByte101, local22.aBoolean652, local22.aBoolean656, local22.aBoolean660, local22.aByte105, local22.aByte107, local22.aByte104, local22.aShort125, local22.anInt8779, local22.aBoolean658, local22.aBoolean655, local43);
			return true;
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!dga;)V")
	@Override
	public void method5391(@OriginalArg(0) Class65 arg0) {
	}

	@OriginalMember(owner = "client!da", name = "aa", descriptor = "()I")
	public native int aa();

	@OriginalMember(owner = "client!da", name = "a", descriptor = "()Z")
	@Override
	public boolean method5395() {
		return true;
	}
}
