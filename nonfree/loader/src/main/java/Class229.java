import java.awt.DisplayMode;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!f")
public final class Class229 {

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "Ljava/awt/DisplayMode;")
	private DisplayMode aDisplayMode1;

	@OriginalMember(owner = "loader!f", name = "b", descriptor = "Ljava/awt/GraphicsDevice;")
	private GraphicsDevice aGraphicsDevice1;

	@OriginalMember(owner = "loader!f", name = "<init>", descriptor = "()V")
	public Class229() throws Exception {
		@Pc(3) GraphicsEnvironment local3 = GraphicsEnvironment.getLocalGraphicsEnvironment();
		this.aGraphicsDevice1 = local3.getDefaultScreenDevice();
		if (!this.aGraphicsDevice1.isFullScreenSupported()) {
			@Pc(14) GraphicsDevice[] local14 = local3.getScreenDevices();
			for (@Pc(18) int local18 = 0; local18 < local14.length; local18++) {
				@Pc(26) GraphicsDevice local26 = local14[local18];
				if (local26 != null && local26.isFullScreenSupported()) {
					this.aGraphicsDevice1 = local26;
					return;
				}
			}
			throw new Exception();
		}
	}

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "(Ljava/awt/Frame;I)V")
	private void method5911(@OriginalArg(0) Frame arg0) {
		@Pc(1) boolean local1 = false;
		try {
			@Pc(6) Field local6 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
			local6.setAccessible(true);
			@Pc(22) boolean local22 = (Boolean) local6.get(this.aGraphicsDevice1);
			if (local22) {
				local1 = true;
				local6.set(this.aGraphicsDevice1, Boolean.FALSE);
			}
		} catch (@Pc(34) Throwable local34) {
		}
		try {
			this.aGraphicsDevice1.setFullScreenWindow(arg0);
		} finally {
			if (local1) {
				try {
					@Pc(63) Field local63 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
					local63.set(this.aGraphicsDevice1, Boolean.TRUE);
				} catch (@Pc(70) Throwable local70) {
				}
			}
		}
	}

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "(ILjava/awt/Frame;IIIB)V")
	public void method5912(@OriginalArg(0) int arg0, @OriginalArg(1) Frame arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aDisplayMode1 = this.aGraphicsDevice1.getDisplayMode();
		if (this.aDisplayMode1 == null) {
			throw new NullPointerException();
		}
		arg1.setUndecorated(true);
		arg1.enableInputMethods(false);
		this.method5911(arg1);
		if (arg4 == 0) {
			@Pc(42) int local42 = this.aDisplayMode1.getRefreshRate();
			@Pc(46) DisplayMode[] local46 = this.aGraphicsDevice1.getDisplayModes();
			@Pc(48) boolean local48 = false;
			for (@Pc(50) int local50 = 0; local50 < local46.length; local50++) {
				if (arg0 == local46[local50].getWidth() && arg2 == local46[local50].getHeight() && local46[local50].getBitDepth() == arg3) {
					@Pc(77) int local77 = local46[local50].getRefreshRate();
					if (!local48 || Math.abs(local77 - local42) < Math.abs(arg4 - local42)) {
						local48 = true;
						arg4 = local77;
					}
				}
			}
			if (!local48) {
				arg4 = local42;
			}
		}
		this.aGraphicsDevice1.setDisplayMode(new DisplayMode(arg0, arg2, arg3, arg4));
	}

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "(Z)V")
	public void method5913() {
		if (this.aDisplayMode1 != null) {
			this.aGraphicsDevice1.setDisplayMode(this.aDisplayMode1);
			if (!this.aGraphicsDevice1.getDisplayMode().equals(this.aDisplayMode1)) {
				throw new RuntimeException("Did not return to correct resolution!");
			}
			this.aDisplayMode1 = null;
		}
		this.method5911(null);
	}

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "(I)[I")
	public int[] method5914() {
		@Pc(3) DisplayMode[] local3 = this.aGraphicsDevice1.getDisplayModes();
		@Pc(9) int[] local9 = new int[local3.length << 2];
		for (@Pc(11) int local11 = 0; local11 < local3.length; local11++) {
			local9[local11 << 2] = local3[local11].getWidth();
			local9[(local11 << 2) + 1] = local3[local11].getHeight();
			local9[(local11 << 2) + 2] = local3[local11].getBitDepth();
			local9[(local11 << 2) + 3] = local3[local11].getRefreshRate();
		}
		return local9;
	}
}
