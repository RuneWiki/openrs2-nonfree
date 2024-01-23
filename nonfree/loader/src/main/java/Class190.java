import java.awt.DisplayMode;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!c")
public final class Class190 {

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "Ljava/awt/DisplayMode;")
	private DisplayMode aDisplayMode1;

	@OriginalMember(owner = "loader!c", name = "b", descriptor = "Ljava/awt/GraphicsDevice;")
	private GraphicsDevice aGraphicsDevice1;

	@OriginalMember(owner = "loader!c", name = "<init>", descriptor = "()V")
	public Class190() throws Exception {
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

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(ILjava/awt/Frame;)V")
	private void method4718(@OriginalArg(1) Frame arg0) {
		@Pc(1) boolean local1 = false;
		try {
			@Pc(6) Field local6 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
			local6.setAccessible(true);
			@Pc(23) boolean local23 = (Boolean) local6.get(this.aGraphicsDevice1);
			if (local23) {
				local6.set(this.aGraphicsDevice1, Boolean.FALSE);
				local1 = true;
			}
		} catch (@Pc(35) Throwable local35) {
		}
		try {
			this.aGraphicsDevice1.setFullScreenWindow(arg0);
		} finally {
			if (local1) {
				try {
					@Pc(62) Field local62 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
					local62.set(this.aGraphicsDevice1, Boolean.TRUE);
				} catch (@Pc(69) Throwable local69) {
				}
			}
		}
	}

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(I)[I")
	public int[] method4719() {
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

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(IIIILjava/awt/Frame;I)V")
	public void method4720(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Frame arg4) {
		this.aDisplayMode1 = this.aGraphicsDevice1.getDisplayMode();
		if (this.aDisplayMode1 == null) {
			throw new NullPointerException();
		}
		arg4.setUndecorated(true);
		arg4.enableInputMethods(false);
		this.method4718(arg4);
		if (arg1 == 0) {
			@Pc(27) boolean local27 = false;
			@Pc(31) int local31 = this.aDisplayMode1.getRefreshRate();
			@Pc(35) DisplayMode[] local35 = this.aGraphicsDevice1.getDisplayModes();
			for (@Pc(37) int local37 = 0; local37 < local35.length; local37++) {
				if (arg0 == local35[local37].getWidth() && arg3 == local35[local37].getHeight() && local35[local37].getBitDepth() == arg2) {
					@Pc(64) int local64 = local35[local37].getRefreshRate();
					if (!local27 || Math.abs(local64 - local31) < Math.abs(arg1 - local31)) {
						local27 = true;
						arg1 = local64;
					}
				}
			}
			if (!local27) {
				arg1 = local31;
			}
		}
		this.aGraphicsDevice1.setDisplayMode(new DisplayMode(arg0, arg3, arg2, arg1));
	}

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(B)V")
	public void method4721() {
		if (this.aDisplayMode1 != null) {
			this.aGraphicsDevice1.setDisplayMode(this.aDisplayMode1);
			if (!this.aGraphicsDevice1.getDisplayMode().equals(this.aDisplayMode1)) {
				throw new RuntimeException("Did not return to correct resolution!");
			}
			this.aDisplayMode1 = null;
		}
		this.method4718(null);
	}
}
