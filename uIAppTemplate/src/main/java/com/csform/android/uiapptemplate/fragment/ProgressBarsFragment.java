package com.csform.android.uiapptemplate.fragment;

import android.app.Fragment;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;

import com.csform.android.uiapptemplate.R;
import com.csform.android.uiapptemplate.view.ProgressWheel;
import com.csform.android.uiapptemplate.view.cpb.CircularProgressButton;

public class ProgressBarsFragment extends Fragment implements OnClickListener {
	
	public static ProgressBarsFragment newInstance() {
		return new ProgressBarsFragment();
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_progress_bars, container, false);
		
		ProgressWheel pb1 = (ProgressWheel) rootView.findViewById(R.id.progress_bar_1),
				pb2 = (ProgressWheel) rootView.findViewById(R.id.progress_bar_2),
				pb3 = (ProgressWheel) rootView.findViewById(R.id.progress_bar_3),
				pb4 = (ProgressWheel) rootView.findViewById(R.id.progress_bar_4),
				pb5 = (ProgressWheel) rootView.findViewById(R.id.progress_bar_5),
				pb6 = (ProgressWheel) rootView.findViewById(R.id.progress_bar_6);
		CircularProgressButton cpb1 = (CircularProgressButton) rootView.findViewById(R.id.circular_progress_bar_1),
				cpb2 = (CircularProgressButton) rootView.findViewById(R.id.circular_progress_bar_2),
				cpb3 = (CircularProgressButton) rootView.findViewById(R.id.circular_progress_bar_3),
				cpb4 = (CircularProgressButton) rootView.findViewById(R.id.circular_progress_bar_4),
				cpb5 = (CircularProgressButton) rootView.findViewById(R.id.circular_progress_bar_5),
				cpb6 = (CircularProgressButton) rootView.findViewById(R.id.circular_progress_bar_6),
				cpb7 = (CircularProgressButton) rootView.findViewById(R.id.circular_progress_bar_7),
				cpb8 = (CircularProgressButton) rootView.findViewById(R.id.circular_progress_bar_8);
		
		pb1.setOnClickListener(this);
		pb2.setOnClickListener(this);
		pb3.setOnClickListener(this);
		pb4.setOnClickListener(this);
		pb5.setOnClickListener(this);
		pb6.setOnClickListener(this);
		cpb1.setOnClickListener(this);
		cpb2.setOnClickListener(this);
		cpb3.setOnClickListener(this);
		cpb4.setOnClickListener(this);
		cpb5.setOnClickListener(this);
		cpb6.setOnClickListener(this);
		cpb7.setOnClickListener(this);
		cpb8.setOnClickListener(this);
		
		return rootView;
	}
	
	@Override
	public void onClick(View v) {
		if (v instanceof ProgressWheel) {
			ProgressWheel pw = (ProgressWheel) v;
			if (pw.isSpinning()) {
				pw.stopSpinning();
			} else {
				pw.spin();
			}
		} else if (v instanceof CircularProgressButton) {
			int id = v.getId();
			if (id == R.id.circular_progress_bar_1 || id == R.id.circular_progress_bar_3 || 
					id == R.id.circular_progress_bar_5 || id == R.id.circular_progress_bar_7) {
				new FalseProgress((CircularProgressButton) v).execute(100);
			} else {
				new FalseProgress((CircularProgressButton) v).execute(-1);
			}
		}
	}
	
	private class FalseProgress extends AsyncTask<Integer, Integer, Integer> {
		
		private CircularProgressButton cpb;
		
		public FalseProgress(CircularProgressButton cpb) {
			this.cpb = cpb;
		}
		
		@Override
		protected Integer doInBackground(Integer... params) {
			for (int progress = 0; progress < 100; progress += 5) {
				publishProgress(progress);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			return params[0];
		}

		@Override
		protected void onPostExecute(Integer result) {
			cpb.setProgress(result);
		}

		@Override
		protected void onProgressUpdate(Integer... values) {
			int progress = values[0];
			cpb.setProgress(progress);
		}
	}
}
