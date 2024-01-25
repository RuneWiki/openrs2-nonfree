import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oa")
public final class oa extends Class100 implements Interface7 {

	@OriginalMember(owner = "client!oa", name = "y", descriptor = "Lclient!ya;")
	private ya aYa2;

	@OriginalMember(owner = "client!oa", name = "K", descriptor = "Lclient!p;")
	private p aP1;

	@OriginalMember(owner = "client!oa", name = "N", descriptor = "Lclient!ql;")
	private Class154 aClass154_6;

	@OriginalMember(owner = "client!oa", name = "Q", descriptor = "[Lclient!a;")
	private a[] anAArray1;

	@OriginalMember(owner = "client!oa", name = "R", descriptor = "I")
	public int anInt7350;

	@OriginalMember(owner = "client!oa", name = "w", descriptor = "Z")
	private boolean aBoolean498 = false;

	@OriginalMember(owner = "client!oa", name = "nativeid", descriptor = "J")
	public final long nativeid = 0L;

	@OriginalMember(owner = "client!oa", name = "x", descriptor = "Lclient!ada;")
	private final Class8 aClass8_49 = new Class8();

	@OriginalMember(owner = "client!oa", name = "J", descriptor = "I")
	private int anInt7349 = 4096;

	@OriginalMember(owner = "client!oa", name = "H", descriptor = "I")
	private int anInt7348 = 4096;

	@OriginalMember(owner = "client!oa", name = "M", descriptor = "Lclient!he;")
	private final Class128 aClass128_25 = new Class128(4);

	@OriginalMember(owner = "client!oa", name = "T", descriptor = "Z")
	private boolean aBoolean499 = false;

	@OriginalMember(owner = "client!oa", name = "I", descriptor = "Lclient!ql;")
	private Class154 aClass154_5;

	@OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!d;II)V")
	public oa(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface4 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super(arg1);
		try {
			if (!Static96.method1571("sw3d")) {
				throw new RuntimeException("");
			}
			Static24.method367();
			this.MA(super.anInterface4_12, 0, 0);
			Static125.method9040(false, true);
			this.aBoolean499 = true;
			this.aClass154_5 = new ja();
			this.method8850(new ja());
			this.method8817(1);
			this.method8805(0);
			if (arg0 != null) {
				this.method8797(arg0, arg2, arg3);
				this.method8788(arg0);
			}
		} catch (@Pc(80) Throwable local80) {
			this.method8789();
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(S)Z")
	private boolean method6326(@OriginalArg(0) short arg0) {
		synchronized (this) {
			@Pc(9) Class325 local9 = super.anInterface4_12.method895(arg0);
			if (local9 == null) {
				return false;
			} else {
				this.AA(arg0, local9.aShort111, local9.anInt9371, local9.aByte115, local9.aByte112, local9.anInt9368, local9.aBoolean633, local9.aByte113, local9.aByte117, local9.aByte116, local9.aByte111, local9.aBoolean636, local9.aBoolean638, local9.aBoolean634, local9.aBoolean637, local9.aBoolean639, local9.aByte114, local9.aBoolean635, local9.aBoolean640, local9.anInt9370);
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method8788(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			this.aP1 = null;
			this.t((p) null);
		} else {
			@Pc(10) p local10 = (p) this.aClass128_25.method3560((long) arg0.hashCode());
			this.aP1 = local10;
			this.t(local10);
		}
	}

	@OriginalMember(owner = "client!oa", name = "h", descriptor = "(I)V")
	@Override
	public void method8824(@OriginalArg(0) int arg0) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!oa", name = "u", descriptor = "()Z")
	@Override
	public boolean method8848() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "(I)V")
	private native void d(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oa", name = "N", descriptor = "(I[I[F)V")
	private native void N(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) float[] arg2);

	@OriginalMember(owner = "client!oa", name = "o", descriptor = "()Z")
	@Override
	public boolean method8825() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "(IIIIII)V")
	@Override
	public void method8845(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.U(arg0, arg1, arg2, arg4, arg5);
		this.U(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.P(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
		this.P(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
	}

	@OriginalMember(owner = "client!oa", name = "DA", descriptor = "(IIII)V")
	public native void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "w", descriptor = "(Z)V")
	public native void w(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!oa", name = "FA", descriptor = "()V")
	private native void FA();

	@OriginalMember(owner = "client!oa", name = "OA", descriptor = "()Ljava/lang/Object;")
	private Object method6327() {
		return new ba(this);
	}

	@OriginalMember(owner = "client!oa", name = "la", descriptor = "()V")
	public native void la();

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "()Lclient!kaa;")
	@Override
	public Class168 method8779() {
		return new Class168(0, "SSE", 1, "CPU", 0L);
	}

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(I)V")
	@Override
	public void method8805(@OriginalArg(0) int arg0) {
		this.anAArray1[arg0].method10();
	}

	@OriginalMember(owner = "client!oa", name = "pa", descriptor = "()V")
	public native void pa();

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "(II)V")
	public native void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!oa", name = "U", descriptor = "(IIIII)V")
	public native void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!oa", name = "EA", descriptor = "(IIII)V")
	public native void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "ya", descriptor = "()V")
	public native void ya();

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method8843(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
	}

	@OriginalMember(owner = "client!oa", name = "ra", descriptor = "(IIII)V")
	public native void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "GA", descriptor = "(I)V")
	public native void GA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "(IIIIII)Lclient!om;")
	@Override
	public Class57 method8829(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "([IIIIIZ)Lclient!pga;")
	@Override
	public Class32 method8777(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		return new j(this, arg0, 0, arg1, arg2, arg3, false);
	}

	@OriginalMember(owner = "client!oa", name = "B", descriptor = "()Lclient!a;")
	public a method6328() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt7350; local1++) {
			if (this.anAArray1[local1].aRunnable1 == Thread.currentThread()) {
				return this.anAArray1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method8769(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) p local8 = (p) this.aClass128_25.method3560((long) arg0.hashCode());
		local8.method6621(arg0, arg1, arg2);
		if (arg0 != null && arg0 == this.aP1.aCanvas9) {
			this.method8788(arg0);
		}
	}

	@OriginalMember(owner = "client!oa", name = "m", descriptor = "()Z")
	@Override
	public boolean method8811() {
		return false;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!of;Z)V")
	private void method6329(@OriginalArg(0) Class236 arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		for (@Pc(15) Class20_Sub6_Sub1 local15 = (Class20_Sub6_Sub1) arg0.aClass157_1.method4486(); local15 != null; local15 = (Class20_Sub6_Sub1) arg0.aClass157_1.method4493()) {
			Static392.anIntArray437[local1++] = local15.anInt8658;
			Static392.anIntArray437[local1++] = local15.anInt8662;
			Static392.anIntArray437[local1++] = local15.anInt8661;
			Static392.anIntArray438[local3++] = local15.anInt8660;
			Static392.aShortArray86[local7++] = (short) local15.anInt8663;
			Static392.anIntArray439[local5++] = local15.anInt8657;
		}
	}

	@OriginalMember(owner = "client!oa", name = "A", descriptor = "()Z")
	@Override
	public boolean method8856() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "q", descriptor = "()Lclient!ql;")
	@Override
	public Class154 method8830() {
		return this.aClass154_6;
	}

	@OriginalMember(owner = "client!oa", name = "r", descriptor = "()Z")
	@Override
	public boolean method8836() {
		return false;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method8835(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method6328().method13(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!oa", name = "H", descriptor = "(III[I)V")
	public native void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!oa", name = "p", descriptor = "()V")
	@Override
	protected void method8826() {
		if (this.aBoolean498) {
			return;
		}
		this.anAArray1 = null;
		this.aP1 = null;
		this.aYa2 = null;
		this.aClass154_5 = null;
		this.aClass128_25.method3562();
		for (@Pc(25) ya local25 = (ya) this.aClass8_49.method149(); local25 != null; local25 = (ya) this.aClass8_49.method155()) {
			local25.ga();
		}
		this.aClass8_49.method154();
		this.FA();
		if (this.aBoolean499) {
			Static252.method4536(false, true);
			this.aBoolean499 = false;
		}
		this.method6331();
		Static24.method365();
		this.aBoolean498 = true;
	}

	@OriginalMember(owner = "client!oa", name = "E", descriptor = "()I")
	public native int E();

	@OriginalMember(owner = "client!oa", name = "finalize", descriptor = "()V")
	@Override
	public synchronized void finalize() {
		this.method8789();
		if (this.nativeid != 0L) {
			Static24.method368(this);
		}
	}

	@OriginalMember(owner = "client!oa", name = "XA", descriptor = "()I")
	public native int XA();

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "(II)I")
	@Override
	public int method8821(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 & 0xFFFFF;
		@Pc(7) int local7 = arg1 & 0xFFFFF;
		return local3 & local7 ^ local7;
	}

	@OriginalMember(owner = "client!oa", name = "n", descriptor = "()Z")
	@Override
	public boolean method8816() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "(I)V")
	@Override
	public void method8813(@OriginalArg(0) int arg0) {
		this.anAArray1[arg0].method14();
	}

	@OriginalMember(owner = "client!oa", name = "da", descriptor = "(III[I)V")
	public native void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIZ)Lclient!pga;")
	@Override
	public Class32 method8804(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new j(this, arg0, arg1, arg2, arg3, !arg4);
	}

	@OriginalMember(owner = "client!oa", name = "x", descriptor = "()V")
	@Override
	public void method8852() {
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(II)V")
	@Override
	public void method8800(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		if (this.aP1 == null) {
			throw new IllegalStateException("off");
		}
		this.aP1.method6620(arg0, arg1);
	}

	@OriginalMember(owner = "client!oa", name = "K", descriptor = "([I)V")
	public native void K(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!oa", name = "va", descriptor = "(Lclient!za;)V")
	private native void va(@OriginalArg(0) Class6_Sub8 arg0);

	@OriginalMember(owner = "client!oa", name = "HA", descriptor = "(IIII[I)V")
	public native void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4);

	@OriginalMember(owner = "client!oa", name = "F", descriptor = "(II)V")
	public native void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!oa", name = "WA", descriptor = "(S)Z")
	private boolean method6330(@OriginalArg(0) short arg0) {
		@Pc(2) Interface4 local2 = super.anInterface4_12;
		synchronized (super.anInterface4_12) {
			if (!super.anInterface4_12.method892(arg0)) {
				return false;
			}
			@Pc(22) Class325 local22 = super.anInterface4_12.method895(arg0);
			if (local22 == null) {
				return false;
			}
			@Pc(44) int[] local44;
			if (local22.anInt9371 == 2) {
				local44 = super.anInterface4_12.method897(arg0, 0.7F, 128, 128);
			} else {
				local44 = super.anInterface4_12.method894(0.7F, true, arg0, 128, 128);
			}
			this.CA(arg0, local44, local22.aShort111, local22.anInt9371, local22.aByte115, local22.aByte112, local22.anInt9368, local22.aBoolean633, local22.aByte113, local22.aByte117, local22.aByte116, local22.aByte111, local22.aBoolean636, local22.aBoolean638, local22.aBoolean634, local22.aBoolean637, local22.aBoolean639, local22.aByte114, local22.aBoolean635, local22.aBoolean640, local22.anInt9370);
			return true;
		}
	}

	@OriginalMember(owner = "client!oa", name = "wa", descriptor = "(IIIIII)V")
	private native void wa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!oa", name = "Q", descriptor = "(IIIIII[BII)V")
	public native void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!pk;)V")
	@Override
	public void method8794(@OriginalArg(0) Interface20 arg0) {
		@Pc(2) wa local2 = (wa) arg0;
		this.n(local2.aJ1.nativeid, local2.aXa1.nativeid);
	}

	@OriginalMember(owner = "client!oa", name = "n", descriptor = "(JJ)V")
	private native void n(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!ql;)V")
	@Override
	public void method8850(@OriginalArg(0) Class154 arg0) {
		this.aClass154_6 = arg0;
		this.ma(((ja) arg0).nativeid);
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method8834(@OriginalArg(0) Canvas arg0) {
		if (this.aP1.aCanvas9 == arg0) {
			this.method8788((Canvas) null);
		}
		@Pc(16) p local16 = (p) this.aClass128_25.method3560((long) arg0.hashCode());
		if (local16 != null) {
			local16.method9043();
			local16.method6622();
		}
	}

	@OriginalMember(owner = "client!oa", name = "MA", descriptor = "(Lclient!d;II)V")
	private native void MA(@OriginalArg(0) Interface4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "()V")
	@Override
	public void method8776() {
	}

	@OriginalMember(owner = "client!oa", name = "l", descriptor = "()Z")
	@Override
	public boolean method8809() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "na", descriptor = "(IIII)[I")
	public native int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "z", descriptor = "()V")
	@Override
	public void method8854() {
		this.method8788(this.aP1.aCanvas9);
	}

	@OriginalMember(owner = "client!oa", name = "ma", descriptor = "(J)V")
	private native void ma(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	@Override
	public void method8792() {
	}

	@OriginalMember(owner = "client!oa", name = "ZA", descriptor = "(IFFFFF)V")
	public native void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!om;Lclient!om;FLclient!om;)Lclient!om;")
	@Override
	public Class57 method8827(@OriginalArg(0) Class57 arg0, @OriginalArg(1) Class57 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class57 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method8781(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.wa(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(I[Lclient!raa;)V")
	@Override
	public void method8828(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub1[] arg1) {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			Static392.anIntArray440[local1++] = arg1[local3].method8264();
			Static392.anIntArray440[local1++] = arg1[local3].method8267();
			Static392.anIntArray440[local1++] = arg1[local3].method8260();
			Static392.anIntArray440[local1++] = arg1[local3].method8268();
			Static392.aFloatArray66[local3] = arg1[local3].method8266();
			Static392.anIntArray440[local1++] = arg1[local3].method8265();
		}
		this.N(arg0, Static392.anIntArray440, Static392.aFloatArray66);
	}

	@OriginalMember(owner = "client!oa", name = "T", descriptor = "(IIII)V")
	public native void T(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "w", descriptor = "()V")
	@Override
	public void method8851() {
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!om;)V")
	@Override
	public void method8783(@OriginalArg(0) Class57 arg0) {
	}

	@OriginalMember(owner = "client!oa", name = "Y", descriptor = "()[I")
	public native int[] Y();

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "(II)I")
	@Override
	public int method8820(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!dh;IIII)Lclient!ka;")
	@Override
	public Class24 method8770(@OriginalArg(0) Class64 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new i(this, this.aYa2, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!oa", name = "X", descriptor = "(I)V")
	public native void X(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oa", name = "JA", descriptor = "(IIIIII)I")
	public native int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!oa", name = "P", descriptor = "(IIIII)V")
	public native void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!oa", name = "h", descriptor = "()Z")
	@Override
	public boolean method8798() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "C", descriptor = "(Z)V")
	public native void C(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!oa", name = "j", descriptor = "()Z")
	@Override
	public boolean method8799() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIILclient!aa;II)V")
	@Override
	public void method8774(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		this.Z(arg0, arg1, arg2, arg3, arg4, 1, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method8797(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) p local8 = (p) this.aClass128_25.method3560((long) arg0.hashCode());
		if (local8 == null) {
			try {
				@Pc(13) Class local13 = Class.forName("java.awt.Canvas");
				@Pc(23) Method local23 = local13.getMethod("setIgnoreRepaint", Boolean.TYPE);
				local23.invoke(arg0, Boolean.TRUE);
			} catch (@Pc(35) Exception local35) {
			}
			local8 = new p(this, arg0, arg1, arg2);
			this.aClass128_25.method3551((long) arg0.hashCode(), local8);
		} else if (local8.anInt7716 != arg1 || local8.anInt7717 != arg2) {
			local8.method6621(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!oa", name = "t", descriptor = "(Lclient!p;)V")
	private native void t(@OriginalArg(0) p arg0);

	@OriginalMember(owner = "client!oa", name = "i", descriptor = "(I)Lclient!za;")
	@Override
	public Class6_Sub8 method8841(@OriginalArg(0) int arg0) {
		@Pc(5) ya local5 = new ya(this, arg0);
		this.aClass8_49.method157(local5);
		return local5;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[[I[[IIII)Lclient!s;")
	@Override
	public Class199 method8810(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new t(this, this.aYa2, arg0, arg1, arg2, arg3, 512, arg4, arg5);
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(Z)V")
	@Override
	public void method8802(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "(I)V")
	@Override
	public void method8817(@OriginalArg(0) int arg0) {
		this.anInt7350 = arg0;
		this.anAArray1 = new a[this.anInt7350];
		for (@Pc(9) int local9 = 0; local9 < this.anInt7350; local9++) {
			this.anAArray1[local9] = new a(this, this.anInt7348, this.anInt7349);
		}
	}

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "()Lclient!ql;")
	@Override
	public Class154 method8785() {
		return this.aClass154_5;
	}

	@OriginalMember(owner = "client!oa", name = "v", descriptor = "()V")
	@Override
	public void method8849() {
	}

	@OriginalMember(owner = "client!oa", name = "k", descriptor = "()V")
	@Override
	public void method8806() {
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "([I)V")
	@Override
	public void method8812(@OriginalArg(0) int[] arg0) {
		@Pc(4) Dimension local4 = this.aP1.aCanvas9.getSize();
		arg0[0] = local4.width;
		arg0[1] = local4.height;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!bi;Lclient!dk;)Lclient!pk;")
	@Override
	public Interface20 method8839(@OriginalArg(0) Interface2 arg0, @OriginalArg(1) Interface5 arg1) {
		return new wa(this, (j) arg0, (xa) arg1);
	}

	@OriginalMember(owner = "client!oa", name = "aa", descriptor = "(IIIIII)V")
	public native void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!hia;[Lclient!fg;Z)Lclient!da;")
	@Override
	public Class50 method8808(@OriginalArg(0) Class133 arg0, @OriginalArg(1) Class98[] arg1) {
		@Pc(3) int[] local3 = new int[arg1.length];
		@Pc(7) int[] local7 = new int[arg1.length];
		@Pc(9) boolean local9 = false;
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			local3[local11] = arg1[local11].anInt2796;
			local7[local11] = arg1[local11].anInt2799;
			if (arg1[local11].aByteArray44 != null) {
				local9 = true;
			}
		}
		if (local9) {
			throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
		}
		return new h(this, this.aYa2, arg0, arg1, (Class32[]) null);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Z)V")
	@Override
	public void method8775(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIILclient!aa;IIIII)V")
	@Override
	public void method8791(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIID)V")
	public native void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4);

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(II)Lclient!bi;")
	@Override
	public Interface2 method8807(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method8823(arg0, arg1, false);
	}

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "()Z")
	@Override
	public boolean method8795() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "za", descriptor = "(IIIII)V")
	protected native void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!oa", name = "y", descriptor = "()Z")
	@Override
	public boolean method8853() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "Z", descriptor = "(IIIIIILclient!aa;II)V")
	private native void Z(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class1 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "()Z")
	@Override
	public boolean method8784() {
		return false;
	}

	@OriginalMember(owner = "client!oa", name = "A", descriptor = "(ILclient!aa;II)V")
	public native void A(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "AA", descriptor = "(SSIBBIZBBBBZZZZZBZZI)V")
	private native void AA(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) byte arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) byte arg9, @OriginalArg(10) byte arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13, @OriginalArg(14) boolean arg14, @OriginalArg(15) boolean arg15, @OriginalArg(16) byte arg16, @OriginalArg(17) boolean arg17, @OriginalArg(18) boolean arg18, @OriginalArg(19) int arg19);

	@OriginalMember(owner = "client!oa", name = "g", descriptor = "()V")
	private void method6331() {
		System.gc();
		System.runFinalization();
		Static24.method366();
	}

	@OriginalMember(owner = "client!oa", name = "KA", descriptor = "(IIII)V")
	public native void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)Lclient!dk;")
	@Override
	public Interface5 method8796(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new xa(arg0, arg1);
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)V")
	@Override
	public void method8803() {
		this.anInt7348 = this.anInt7349 = 10000;
		if (this.anInt7350 > 1) {
			throw new IllegalStateException("No MT");
		}
		this.method8817(this.anInt7350);
		this.method8805(0);
	}

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "()I")
	@Override
	public int method8780() {
		return 4;
	}

	@OriginalMember(owner = "client!oa", name = "xa", descriptor = "(F)V")
	public native void xa(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIZ)Lclient!pga;")
	@Override
	public Class32 method8823(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return new j(this, arg0, arg1);
	}

	@OriginalMember(owner = "client!oa", name = "I", descriptor = "()I")
	public native int I();

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!fg;Z)Lclient!pga;")
	@Override
	public Class32 method8773(@OriginalArg(0) Class98 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(17) j local17 = new j(this, arg0.anIntArray184, arg0.aByteArray45, arg0.aByteArray44, 0, arg0.anInt2796, arg0.anInt2796, arg0.anInt2799);
		local17.method5073(arg0.anInt2797, arg0.anInt2798, arg0.anInt2794, arg0.anInt2795);
		return local17;
	}

	@OriginalMember(owner = "client!oa", name = "s", descriptor = "()Lclient!ql;")
	@Override
	public Class154 method8838() {
		return new ja();
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method8855(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		if (this.aP1 == null) {
			throw new IllegalStateException("off");
		}
		this.aP1.method6623(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!of;I)V")
	@Override
	public void method8831(@OriginalArg(0) Class236 arg0, @OriginalArg(1) int arg1) {
		this.method6329(arg0);
		this.method6328().method16(this, Static392.anIntArray437, Static392.anIntArray438, Static392.anIntArray439, Static392.aShortArray86, arg0.aClass157_1.method4488());
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!za;)V")
	@Override
	public void method8787(@OriginalArg(0) Class6_Sub8 arg0) {
		this.aYa2 = (ya) arg0;
		this.va(arg0);
	}

	@OriginalMember(owner = "client!oa", name = "M", descriptor = "()I")
	public native int M();

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(FFF)V")
	@Override
	public void method8819(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!oa", name = "r", descriptor = "(IIIIIII)I")
	public native int r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIII)V")
	@Override
	public void method8771(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!oa", name = "i", descriptor = "()I")
	public native int i();

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIF)Lclient!raa;")
	@Override
	public Class6_Sub1 method8786(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class6_Sub1_Sub3(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!oa", name = "L", descriptor = "(III)V")
	public native void L(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[I[I)Lclient!aa;")
	@Override
	public Class1 method8842(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new na(this, this.aYa2, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!oa", name = "g", descriptor = "(I)V")
	@Override
	public void method8818(@OriginalArg(0) int arg0) {
		Static24.method366();
		this.d(arg0);
		for (@Pc(10) ya local10 = (ya) this.aClass8_49.method149(); local10 != null; local10 = (ya) this.aClass8_49.method155()) {
			local10.r();
		}
	}

	@OriginalMember(owner = "client!oa", name = "CA", descriptor = "(S[ISIBBIZBBBBZZZZZBZZI)V")
	private native void CA(@OriginalArg(0) short arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) short arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4, @OriginalArg(5) byte arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) byte arg9, @OriginalArg(10) byte arg10, @OriginalArg(11) byte arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13, @OriginalArg(14) boolean arg14, @OriginalArg(15) boolean arg15, @OriginalArg(16) boolean arg16, @OriginalArg(17) byte arg17, @OriginalArg(18) boolean arg18, @OriginalArg(19) boolean arg19, @OriginalArg(20) int arg20);

	@OriginalMember(owner = "client!oa", name = "t", descriptor = "()Z")
	@Override
	public boolean method8840() {
		return false;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!of;)V")
	@Override
	public void method8844(@OriginalArg(0) Class236 arg0) {
		if (arg0.aClass157_1.method4488() != 0) {
			this.method6329(arg0);
			this.method6328().method16(this, Static392.anIntArray437, Static392.anIntArray438, Static392.anIntArray439, Static392.aShortArray86, arg0.aClass157_1.method4488());
		}
	}
}
